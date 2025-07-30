package spring_boot.literalura.repository;

import java.time.Year;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring_boot.literalura.models.AuthorModel;
import spring_boot.literalura.models.BookModel;


public interface BookRepository extends JpaRepository<BookModel, Long>{
  @Query("SELECT l FROM BookModel l WHERE LOWER(l.titulo) = LOWER(:titulo)")
  List<BookModel> findByTitulo(String titulo);

  @Query("SELECT a FROM AuthorModel a WHERE a.nascimento <= :ano AND (a.falecimento IS NULL OR a.falecimento >= :ano)")
  List<AuthorModel> findAutoresVivos(@Param("ano") Year ano);

  @Query("SELECT a FROM AuthorModel a WHERE a.nascimento <= :ano AND a.falecimento = :ano")
  List<AuthorModel> findAutoresPorMorte(@Param("ano") Year ano);

  @Query("SELECT l from BookModel l WHERE l.idioma LIKE %:idioma%")
  List<BookModel> findByIdioma(@Param("idioma") String idioma);


  
}
