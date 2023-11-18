package com.bertoti.bookstore.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bertoti.bookstore.domain.book.Book;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long>{
    public Book save(Book book);
    public List<Book> findAll();
    public Optional<Book> findById(Long id);

    
  

}
