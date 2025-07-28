package spring_boot.literalura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Author(
  @JsonAlias("name") String nome,
  @JsonAlias("birth_year") int anoDeNascimento,
  @JsonAlias("death_year") int anoDeFalecimento
) {

  @Override
  public String toString() {
    return "Autor: " + nome;
  }

  
  
}
