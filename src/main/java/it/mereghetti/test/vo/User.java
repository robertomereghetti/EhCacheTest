package it.mereghetti.test.vo;

import java.util.List;

public class User {
    private List<Mail> contacts;
    private String username;
    private Long id;

    public String getUsername() {
        return username;
    }

    public List<Mail> getContacts() {
        return contacts;
    }

    public void setContacts(List<Mail> contacts) {
        this.contacts = contacts;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
