package com.lesson1.lesson18;

public class Authentication {
    public static void main(String[] args) {
        try {
            System.out.println(isCorrect("login 1", " password 1", "password 1"));
            System.out.println(isCorrect("login 1login 1login 1login 1login 1login 1login 1login 1", " password 1", "password 1"));
            System.out.println(isCorrect("login 1", " password 1password 1password 1password 1password 1password 1", "password 2"));
            System.out.println(isCorrect("login 1", " password 1", "password 2password 2password 2password 2password 2password 2"));
            System.out.println(isCorrect("login 1login 1login 1login 1login 1login 1", " password 1",
                    "password 1password 1password 1password 1password 1"));
            System.out.println(isCorrect("login 1login 1login 1login 1login 1login 1",
                    " password 1password 1password 1password 1password 1",
                    "password 2password 2password 2password 2password 2password 2"));
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
        System.out.println("END.");
    }

    public static boolean isCorrect(String login, String password, String confPassword) throws WrongLoginException, WrongPasswordException {
        {
            if (login.length() > 20) {
                throw new WrongLoginException("Wrong Login");
            }
        }
        if (password.length() > 20 || !password.equals(confPassword)) {
            throw new WrongPasswordException("Wrong Password");
        }
        return true;
    }
}
