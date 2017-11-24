package com.lesson1.lesson15.user;

public class UserQuery {
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

    /*static class Query1 {
        public void printToLog() {
            System.out.println("User: " + getLogin()+ " with password " + getPassword() + " has a request.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserQuery userQuery = (UserQuery) o;

        if (password != userQuery.password) return false;
        return login != null ? login.equals(userQuery.login) : userQuery.login == null;

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + password;
        return result;
    }

    @Override
    public String toString() {
        return "UserQuery: " +
                "login: " + login + '\'' +
                ", password: " + password;
    }

    public static void main(String[] args) {
        UserQuery.Query1 q = new UserQuery.Query1();
        q.printToLog();
        Query1 q1 = new Query1();
        q1.printToLog();
    }*/
}
