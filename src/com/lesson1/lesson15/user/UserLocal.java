package com.lesson1.lesson15.user;

public class UserLocal {
    private String login;
    private int password;

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void createQuery() {
        class Query {
            final int pass = 333;

            public void printToLog() {
                System.out.println("User: " + getLogin() + " with password " + getPassword() + " private pass " + pass + " has a request.");
            }
        }

        Query privateData = new Query();
        privateData.printToLog();
    }

    @Override
    public String toString() {
        return "UserLocal{} " + super.toString();
    }

    public static void main(String[] args) {
        UserLocal userLocal = new UserLocal();
        userLocal.createQuery();
    }
}
