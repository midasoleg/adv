package com.managerAdv.adv.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "user_auth")
public class UserAuthorization implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_auth")
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @OneToMany
    @JoinTable(name = "id_user_auth_role", joinColumns =
    @JoinColumn(name = "id_user_auth"), inverseJoinColumns =
    @JoinColumn(name = "id_role"))
    private Set<Role> roles;

    public UserAuthorization() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
