package spring_boot.literalura.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring_boot.literalura.models.BookModel;

@Repository
public interface BookRepository extends CrudRepository<BookModel, Long>{
  
  
}
