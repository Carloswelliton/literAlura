package spring_boot.literalura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Books(@JsonAlias("title")String Titulo,
                    @JsonAlias("author") String autor,
                    @JsonAlias("name") String nome,
                    @JsonAlias("birth_year") String dataDeNascimento,
                    @JsonAlias("death_year") String dataDefalecimento,
                    @JsonAlias("languages") String idiomas,
                    @JsonAlias("download_count") int quantidadeDownload
) {}
