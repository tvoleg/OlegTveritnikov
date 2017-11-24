package com.lesson1.lesson18;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(String massage) {
        super(massage);
    }

    public WrongPasswordException() {
    }
}
