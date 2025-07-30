package spring_boot.literalura.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Books(@JsonAlias("title") String titulo,
                    @JsonAlias("authors") List<Author> autor,
                    @JsonAlias("languages") List<String> idioma,
                    @JsonAlias("download_count") int quantidadeDownload
) {

    public String firstLanguage(){
      if(idioma!=null && !idioma.isEmpty()){
        return idioma.get(0);
      }
      return "idioma desconhecido";
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Título: ").append(titulo).append("\n");
      sb.append("Autor(es): \n");
      for(Author author : autor){
        sb.append(" - ").append(author.nome()).append("\n");
      }
      sb.append("Idioma: ").append(idioma).append("\n");
      sb.append("Quantidade de downloads: ").append(quantidadeDownload).append("\n");
      sb.append("-------------------------------------\n");
      return sb.toString();
    }

    

    



}
