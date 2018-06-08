package com.managerAdv.adv.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_info")
public class UserInfo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_info")
    private int id;

    @Column(name = "username")
    private String userName;

    @Column(name = "phone")
    private int phone;

    @Column(name = "email")
    private String email;

    public UserInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
