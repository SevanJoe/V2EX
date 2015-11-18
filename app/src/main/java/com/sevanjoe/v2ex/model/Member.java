package com.sevanjoe.v2ex.model;

/**
 * Created by Sevan on 2015/11/18.
 */
public class Member {
    private int id;
    private String username;
    private String tagline;
    private String avatar_mini;
    private String avatar_normal;
    private String avatar_large;

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public void setAvatar_mini(String avatar_mini) {
        this.avatar_mini = avatar_mini;
    }

    public void setAvatar_normal(String avatar_normal) {
        this.avatar_normal = avatar_normal;
    }

    public void setAvatar_large(String avatar_large) {
        this.avatar_large = avatar_large;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getTagline() {
        return tagline;
    }

    public String getAvatar_mini() {
        return avatar_mini;
    }

    public String getAvatar_normal() {
        return avatar_normal;
    }

    public String getAvatar_large() {
        return avatar_large;
    }
}
