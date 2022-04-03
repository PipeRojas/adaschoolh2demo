package edu.adaschool.h2demo.controller;

import edu.adaschool.h2demo.controller.dto.BookDto;
import edu.adaschool.h2demo.repository.IBookRepository;
import edu.adaschool.h2demo.repository.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/api/v1")
public class BookController {
    private final IBookRepository bookRepository;

    public BookController(@Autowired IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public Book create(@RequestBody BookDto bookDto ){
        return bookRepository.save( new Book( bookDto ) );
    }

    @GetMapping("/{id}")
    public Optional<Book> findById(@PathVariable String id ){
        return bookRepository.findById( id );
    }

    @PutMapping("/{id}")
    public Optional<Book> update( @PathVariable String id, @RequestBody BookDto bookDto ){
        Optional<Book> ans = bookRepository.findById(id);
        ans.ifPresent(book ->
        {
            book.update(bookDto);
            bookRepository.save(book);
        });
        return ans;
    }

    @DeleteMapping("/{id}")
    public Optional<Book> delete( @PathVariable String id ){
        Optional<Book> ans = bookRepository.findById(id);
        ans.ifPresent(bookRepository::delete);
        return ans;
    }
}
