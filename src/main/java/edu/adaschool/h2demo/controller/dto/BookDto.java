package edu.adaschool.h2demo.controller.dto;

import java.math.BigInteger;

public class BookDto {
    private String ISBN;
    private String title;
    private String language;
    private BigInteger pagesQuantity;

    public BookDto() {
    }

    public BookDto(String ISBN, String title, String language, BigInteger pagesQuantity) {
        this.ISBN = ISBN;
        this.title = title;
        this.language = language;
        this.pagesQuantity = pagesQuantity;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public BigInteger getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(BigInteger pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }
}
