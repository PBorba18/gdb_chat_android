package com.example.chatfirebase;

public class MyUser {

    private final String uuid;
    private final String username;
    private final String profileUrl;

    public MyUser(String uuid, String username, String profileUrl) {
        this.uuid = uuid;
        this.username = username;
        this.profileUrl = profileUrl;
    }

    public String getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public String getProfileUrl() {
        return profileUrl;
    }
}
