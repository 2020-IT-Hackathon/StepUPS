package com.ups.hackathon;

import java.util.List;
import java.util.ArrayList;

public class Volunteer extends User {
    
    private double hoursVolunteered;

    public Volunteer(String name, String address, String email, String initiativeType, String skillA, String skillB, String skillC, String skillD, String skillE) {
        super(name, address, email, initiativeType, skillA, skillB, skillC, skillD, skillE);
    }
    public Volunteer(String name, String address, String email, String initiativeType, String skillA, String skillB, String skillC, String skillD) {
        super(name, address, email, initiativeType, skillA, skillB, skillC, skillD);
    }
    public Volunteer(String name, String address, String email, String initiativeType, String skillA, String skillB, String skillC) {
        super(name, address, email, initiativeType, skillA, skillB, skillC);
    }
    public Volunteer(String name, String address, String email, String initiativeType, String skillA, String skillB) {
        super(name, address, email, initiativeType, skillA, skillB);
    }
    public Volunteer(String name, String address, String email, String initiativeType, String skillA) {
        super(name, address, email, initiativeType, skillA);
    }
    public Volunteer(String name, String address, String email, String initiativeType) {
        super(name, address, email, initiativeType);
    }
    public Volunteer(String name, String address, String email) {
        super(name, address, email);
    }
    public void addHours(int hoursToAdd) {
        hoursVolunteered += hoursToAdd;
    }
    public double getHours() {
        return hoursVolunteered;
    }
}