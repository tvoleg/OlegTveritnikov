package com.lesson1.lesson15.user;


public class User {
    private String login;
    private int password;

    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public class Query {
        public void printToLog(String login, int password) {
            System.out.println("User: " + login + " with password " + password + " has a request.");
        }
    }

    public void createQuery(String login, int password) {
        Query query = new Query();
        query.printToLog("Fred", 666);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (password != user.password) return false;
        return login != null ? login.equals(user.login) : user.login == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + password;
        return result;
    }

    @Override
    public String toString() {
        return "User:" +
                "login='" + login + '\'' +
                ", password=" + password;
    }

    public static void main(String[] args) {
        User user = new User("Alex", 777);
        User.Query query = user.new Query();
        User.Query query1 = new User("John", 999).new Query();

        query.printToLog("User1", 112233);
        query1.printToLog("User2", 44544);

    }
}

