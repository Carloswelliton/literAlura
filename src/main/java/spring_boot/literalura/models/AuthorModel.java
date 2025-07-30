package spring_boot.literalura.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Autor")
public class AuthorModel {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  private String nascimento;

  @Column(nullable = false)
  private String falecimento;

  

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

  public String getNascimento() {
    return nascimento;
  }

  public void setNascimento(String nascimento) {
    this.nascimento = nascimento;
  }

  public String getFalecimento() {
    return falecimento;
  }

  public void setFalecimento(String falecimento) {
    this.falecimento = falecimento;
  }

  
  
}
