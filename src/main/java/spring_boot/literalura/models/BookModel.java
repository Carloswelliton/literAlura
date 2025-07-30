package spring_boot.literalura.models;

import jakarta.persistence.*;

@Entity
@Table(name="Livros")
public class BookModel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String titulo;

  @ManyToOne(cascade = CascadeType.ALL)
  private AuthorModel autor;

  @Column(nullable = false)
  private String idioma;

  @Column(nullable = false)
  private Integer quantidadeDownload;

  public BookModel() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public AuthorModel getAutor() {
    return autor;
  }

  public void setAutor(AuthorModel autor) {
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
