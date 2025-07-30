package spring_boot.literalura.models;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Autor")
public class AuthorModel {

  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  private Year nascimento;

  @Column(nullable = false)
  private Year falecimento;

  @OneToMany(mappedBy = "autor", fetch = FetchType.EAGER)
  private List<BookModel> livros = new ArrayList<>();


  public AuthorModel() {
  }


  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public String getNome() {
    return nome;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }


  public Year getNascimento() {
    return nascimento;
  }


  public void setNascimento(Year nascimento) {
    this.nascimento = nascimento;
  }


  public Year getFalecimento() {
    return falecimento;
  }


  public void setFalecimento(Year falecimento) {
    this.falecimento = falecimento;
  }


  public List<BookModel> getLivros() {
    return livros;
  }


  public void setLivros(List<BookModel> livros) {
    this.livros = livros;
  }

  

  
}
