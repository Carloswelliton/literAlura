package spring_boot.literalura.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GutendexResponse(
  @JsonAlias("results") List<Books> result
) {
  
}
