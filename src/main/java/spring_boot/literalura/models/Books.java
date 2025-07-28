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

    public String firstAuthor(){
      if(autor!=null && !autor.isEmpty()){
        return autor.get(0).nome();
      }
      return "Autor desconhecido";
    }

    public String firstLanguage(){
      if(idioma!=null && !idioma.isEmpty()){
        return idioma.get(0);
      }
      return "idioma desconhecido";
    }

    

    



}
