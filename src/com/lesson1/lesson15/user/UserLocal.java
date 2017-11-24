package com.lesson1.lesson15.user;

public class UserLocal {
    private String login;
    private int password;

    public void createQuery() {
        class Query {
            final int pass = 333;

            public void printToLog() {
                System.out.println("User: " + login + " with password " + password + " private pass " + pass + " has a request.");
            }
        }

        Query privateData = new Query();
        privateData.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLocal userLocal = (UserLocal) o;

        if (password != userLocal.password) return false;
        return login != null ? login.equals(userLocal.login) : userLocal.login == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + password;
        return result;
    }

    @Override
    public String toString() {
        return "UserLocal:" +
                "login='" + login + '\'' +
                ", password=" + password;
    }

    public static void main(String[] args) {
        UserLocal userLocal = new UserLocal();
        userLocal.createQuery();
    }
}
