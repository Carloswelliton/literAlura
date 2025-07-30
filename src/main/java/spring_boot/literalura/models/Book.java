package spring_boot.literalura.models;

import jakarta.persistence.*;

@Entity
@Table(name="Livros")
public class Book {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String titulo;

  @Column(nullable = false)
  private String autor;

  @Column(nullable = false)
  private String idioma;

  @Column(nullable = false)
  private Integer quantidadeDownload;

  public Book() {
  }

  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }
  public String getIdioma() {
    return idioma;
  }
  public void setIdioma(String idioma) {
    this.idioma = idioma;
  }
  public Integer getQuantidadeDownload() {
    return quantidadeDownload;
  }
  public void setQuantidadeDownload(Integer quantidadeDownload) {
    this.quantidadeDownload = quantidadeDownload;
  }

  
  
}
