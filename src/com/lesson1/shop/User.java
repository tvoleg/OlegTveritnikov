package com.lesson1.shop;

public class User {
    private int id;
    private String login, user_password;

    public User(int id, String login, String user_password) {
        this.id = id;
        this.login = login;
        this.user_password = user_password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", user_password='" + user_password + '\'' +
                '}';
    }
}