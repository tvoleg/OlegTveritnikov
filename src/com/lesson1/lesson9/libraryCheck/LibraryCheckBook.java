package com.lesson1.lesson9.libraryCheck;

import java.util.Arrays;

public class LibraryCheckBook {
    private Book[] books;
    private LibraryUsers[] users;

    public LibraryCheckBook() {
    }

    public LibraryCheckBook(LibraryUsers... users) {
        this.users = users;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public LibraryUsers[] getUsers() {
        return users;
    }

    public void setUsers(LibraryUsers[] users) {
        this.users = users;
    }

    public void takeBook(int countBooks) {
        books = new Book[countBooks];
    }

    public void takeBook(String... bookTitles) {
        books = new Book[bookTitles.length];
        for (int i = 0; i < bookTitles.length; i++) {
            books[i] = new Book(bookTitles[i]);
        }
    }

    public Book[] returnBook(int countBooks) {
        return new Book[]{new Book("Harry Potter"), new Book("451 fahrenheit")};
    }

    public Book[] returnBook(String... bookTitles) {
        Book[] books = new Book[bookTitles.length];
        for (int i = 0; i < bookTitles.length; i++) {
            books[i] = new Book(bookTitles[i]);
        }
        return books;
    }

    public void printUsersInfo() {
        if (users != null) {
            for (LibraryUsers user : users) {
                System.out.println("User name: " + user.getUserName() + ";\n" + "Faculty: " + user.getFaculty() + ";\n"
                        + "Birthday Date: " + user.getBirthdayDate() + ";\n" + "Phone number: " + user.getPhoneNumber() + ";\n"
                        + "Library card number: " + user.getCardNumber() + ".");
            }
        } else {
            System.out.println("Wrong user.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryCheckBook that = (LibraryCheckBook) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(books, that.books)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(books);
        result = 31 * result + Arrays.hashCode(users);
        return result;
    }

    @Override
    public String toString() {
        return "LibraryCheckBook{" +
                "books=" + Arrays.toString(books) +
                ", users=" + Arrays.toString(users) +
                '}';
    }

    public static void main(String[] args) {
        LibraryUsers user[] = new LibraryUsers[]{
                new LibraryUsers("Alex", "Psychology", "14.02.1996",
                        "+380987654321", "A142B3\n"),
                new LibraryUsers("Mike", "History", "15.01.1990",
                        "+3809876542434", "A142B3\n"),
                new LibraryUsers("Kate", "Astronaut", "01.10.1988",
                        "+38098763441", "A142B3\n")};
        LibraryCheckBook libraryCheckBook = new LibraryCheckBook();
        libraryCheckBook.setUsers(user);
        libraryCheckBook.printUsersInfo();
        libraryCheckBook.takeBook();
        libraryCheckBook.returnBook();
    }
}
