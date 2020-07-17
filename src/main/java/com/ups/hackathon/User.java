package com.ups.hackathon;

import java.util.List;
import java.util.ArrayList;

public class User {

    private String name;
    private String address;
    private String email;
    private String initiativeType;
    private List skills;

    public User(String name, String address, String email, String initiativeType, String skillA, String skillB, String skillC, String skillD, String skillE) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.initiativeType = initiativeType;
        skills = new ArrayList<String>();

        skills.add(skillA);
        skills.add(skillB);
        skills.add(skillC);
        skills.add(skillD);
        skills.add(skillE);
    }

    public User(String name, String address, String email, String initiativeType, String skillA, String skillB, String skillC, String skillD) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.initiativeType = initiativeType;
        skills = new ArrayList<String>();

        skills.add(skillA);
        skills.add(skillB);
        skills.add(skillC);
        skills.add(skillD);
    }
    public User(String name, String address, String email, String initiativeType, String skillA, String skillB, String skillC) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.initiativeType = initiativeType;
        skills = new ArrayList<String>();

        skills.add(skillA);
        skills.add(skillB);
        skills.add(skillC);
    }
    public User(String name, String address, String email, String initiativeType, String skillA, String skillB) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.initiativeType = initiativeType;
        skills = new ArrayList<String>();

        skills.add(skillA);
        skills.add(skillB);
    }
    public User(String name, String address, String email, String initiativeType, String skillA) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.initiativeType = initiativeType;
        skills = new ArrayList<String>();

        skills.add(skillA);
    }
    public User(String name, String address, String email, String initiativeType) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.initiativeType = initiativeType;
        skills = new ArrayList<String>();
    }
    public User(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        skills = new ArrayList<String>();
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public void setEmail(String newEmail) {
        email = newEmail;
    }
    public void addSkill(String newSkill) {
        if (skills.size() < 5) skills.add(newSkill);
    }
    public void removeSkill(String skillToRemove) {
        if (skills.contains(skillToRemove)) skills.remove(skillToRemove);
    }
}