package com.lesson1.lesson18;

public class Authentication {
    public static void main(String[] args) {
        System.out.println(isCorrect("login 1", " password 1", "password 1"));
        System.out.println(isCorrect("login 1login 1login 1login 1login 1login 1login 1login 1", " password 1", "password 1"));
        System.out.println(isCorrect("login 1", " password 1password 1password 1password 1password 1password 1", "password 2"));
        System.out.println(isCorrect("login 1", " password 1", "password 2password 2password 2password 2password 2password 2"));
        System.out.println(isCorrect("login 1login 1login 1login 1login 1login 1", " password 1",
                "password 1password 1password 1password 1password 1"));
        System.out.println(isCorrect("login 1login 1login 1login 1login 1login 1",
                " password 1password 1password 1password 1password 1",
                "password 2password 2password 2password 2password 2password 2"));

        System.out.println("END.");
    }

    public static boolean isCorrect(String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Wrong Login");
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Wrong Password");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println(login + "\n" + password + "\n" + confPassword);
        }
        return true;
    }

}
