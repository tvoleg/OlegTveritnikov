package com.lesson1.lesson9.libraryCheck;

public class Book {
    private String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book bookList = (Book) o;

        return bookTitle != null ? bookTitle.equals(bookList.bookTitle) : bookList.bookTitle == null;
    }

    @Override
    public int hashCode() {
        return bookTitle != null ? bookTitle.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Book: " +
                "bookTitle='" + bookTitle;
    }
}
