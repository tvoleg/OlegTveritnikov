package com.lesson1.lesson18;

public class WrongLoginException extends Exception{
    public WrongLoginException(String massage) {
        super(massage);
    }

    public WrongLoginException() {
    }
}
