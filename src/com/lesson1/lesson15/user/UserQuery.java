package com.lesson1.lesson15.user;

public class UserQuery {
    private String login;
    private int password;

    static class Query1 {
        public void printToLog(String login, int password) {
            System.out.println("User: " + login + " with password " + password + " has a request.");
        }
    }

    public static void main(String[] args) {
        UserQuery.Query1 q = new UserQuery.Query1();
        q.printToLog("Oz", 777);
        Query1 q1 = new Query1();
        q1.printToLog("A", 345);
    }
}
