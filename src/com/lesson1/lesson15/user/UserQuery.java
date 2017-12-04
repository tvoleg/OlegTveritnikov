package com.lesson1.lesson15.user;

public class UserQuery {
    private static String login = "Name";
    private static int password = 343;

    public static String getLogin() {
        return login;
    }

    public static int getPassword() {
        return password;
    }


    static class Query1 {
        public void printToLog() {
            System.out.println("User: " + getLogin() + " with password " + getPassword() + " has a request.");
        }
    }

    public static void main(String[] args) {
        UserQuery.Query1 q = new UserQuery.Query1();
        q.printToLog();
        Query1 q1 = new Query1();
        q1.printToLog();
    }

    @Override
    public String toString() {
        return "UserQuery{}";
    }
}
