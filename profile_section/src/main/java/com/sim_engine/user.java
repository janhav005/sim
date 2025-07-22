package com.sim_engine;

import java.util.List;

public class user {
    private String username;
    private String email;
    private List<String> favourites;

    public user(String username, String email, List<String> favourites) {
        this.username = username;
        this.email = email;
        this.favourites = favourites;
    }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public List<String> getFavourites() { return favourites; }
}
