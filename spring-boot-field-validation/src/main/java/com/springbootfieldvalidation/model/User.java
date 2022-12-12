package com.springbootfieldvalidation.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    public User(){}
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Id
    @Column(name="user_id", updatable = false, nullable = false)
    private UUID userId;

    @Column(name="name")
    private String name;

    @Column(name="username")
    private String username;

    @Column(name="user_role")
    private String userRole;

    @Column(name="password")
    private String password;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
