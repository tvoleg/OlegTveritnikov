package com.lesson1.lesson15;

public class UserLocal {
    private String login;
    private int password;

    public void createQuery(String login, int password){
    class Query {
        final int pass = 333;
        public void printToLog() {
            System.out.println("User: " + login + " with password " + password + " private pass " + pass + " has a request.");
        }
    }

    Query privateData = new Query();
    privateData.printToLog();
}

    public static void main(String[] args) {
        UserLocal userLocal = new UserLocal();
        userLocal.createQuery("John", 1111);
    }
}
