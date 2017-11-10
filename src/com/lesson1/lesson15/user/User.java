package com.lesson1.lesson15.user;

public class User {
    private String login;
    private int password;

    public class Query{
        public void printToLog(String login, int password){
            System.out.println("User: " + login + " with password " + password + " has a request.");
        }
    }

    public void createQuery(){
        Query query = new Query();
        query.printToLog("Fred", 666);
    }

    public static void main(String[] args) {
        User user = new User();
        User.Query query  = user.new Query();
        User.Query query1 = new User().new Query();

        query.printToLog("Alex", 112233);
        query1.printToLog("John",44544);
    }
}
