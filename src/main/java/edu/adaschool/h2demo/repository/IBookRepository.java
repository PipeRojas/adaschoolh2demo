package edu.adaschool.h2demo.repository;

import edu.adaschool.h2demo.repository.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IBookRepository extends CrudRepository<Book, String> {
}
