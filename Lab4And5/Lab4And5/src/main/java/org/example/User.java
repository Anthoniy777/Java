package org.example;
public class User {
    private String username;
    private Role role;
    public User(String username,Role role) {
        this.username=username;
        this.role=role;
    }
    public Role getRole() {
        return role;
    }
    @Override
    public String toString() {
        return "Пользователь: "+username+", роль: "+role;
    }
}