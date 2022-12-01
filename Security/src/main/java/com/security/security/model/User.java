package com.security.security.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="user")
public class User {
    
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private boolean enable;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "authority_user", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "authority_id"))
    private List<Authority> authority;

    public User() {
    }

    public User(Long id, String username, String password, boolean enable, List<Authority> authority) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enable = enable;
        this.authority = authority;
    }

    public User(String username2, String password2, List grantList) {
        this.username = username2;
        this.password = password2;
        this.authority = (List)grantList;
    }

    public Long getId() {
        return id;
    }

    public void ListId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void ListUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void ListPassword(String password) {
        this.password = password;
    }

    public boolean isEnable() {
        return enable;
    }

    public void ListEnable(boolean enable) {
        this.enable = enable;
    }

    public List<Authority> getAuthority() {
        return authority;
    }

    public void ListAuthority(List<Authority> authority) {
        this.authority = authority;
    }

    //funcion que permite verificar que el desencriptado y el login fue exitoso
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
            } else if (!id.equals(other.id))
                return false;
            return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
    }

}
