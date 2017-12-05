package com.lesson1.lesson9.libraryCheck;

public class LibraryUsers {
    String userName, faculty, birthdayDate, phoneNumber, cardNumber;
    private Book book;

    public LibraryUsers(String userName, String faculty, String birthdayDate, String phoneNumber, String cardNumber) {
        this.userName = userName;
        this.faculty = faculty;
        this.birthdayDate = birthdayDate;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void takeBook(Book bookOne) {
        book = bookOne;
    }

    public Book returnBook() {
        return book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUsers that = (LibraryUsers) o;

        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (faculty != null ? !faculty.equals(that.faculty) : that.faculty != null) return false;
        if (birthdayDate != null ? !birthdayDate.equals(that.birthdayDate) : that.birthdayDate != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (cardNumber != null ? !cardNumber.equals(that.cardNumber) : that.cardNumber != null) return false;
        return book != null ? book.equals(that.book) : that.book == null;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + (birthdayDate != null ? birthdayDate.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        result = 31 * result + (book != null ? book.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LibraryUsers{" +
                "userName='" + userName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", birthdayDate='" + birthdayDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", book=" + book +
                '}';
    }
}
