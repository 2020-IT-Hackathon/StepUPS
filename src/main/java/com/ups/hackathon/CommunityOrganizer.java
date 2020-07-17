package com.ups.hackathon;

import java.util.List;
import java.util.ArrayList;

public class CommunityOrganizer extends User {

    private List<Event> eventList;
    
    public CommunityOrganizer(String name, String address, String email, String initiativeType, String skillA, String skillB, String skillC, String skillD, String skillE) {
        super(name, address, email, initiativeType, skillA, skillB, skillC, skillD, skillE);
    }
    public CommunityOrganizer(String name, String address, String email, String initiativeType, String skillA, String skillB, String skillC, String skillD) {
        super(name, address, email, initiativeType, skillA, skillB, skillC, skillD);
    }
    public CommunityOrganizer(String name, String address, String email, String initiativeType, String skillA, String skillB, String skillC) {
        super(name, address, email, initiativeType, skillA, skillB, skillC);
    }
    public CommunityOrganizer(String name, String address, String email, String initiativeType, String skillA, String skillB) {
        super(name, address, email, initiativeType, skillA, skillB);
    }
    public CommunityOrganizer(String name, String address, String email, String initiativeType, String skillA) {
        super(name, address, email, initiativeType, skillA);
    }
    public CommunityOrganizer(String name, String address, String email, String initiativeType) {
        super(name, address, email, initiativeType);
    }
    public CommunityOrganizer(String name, String address, String email) {
        super(name, address, email);
    }

    private void createEvent(String eventName, String location, String date, double hours) {
        eventList.add(new Event(eventName, location, date, hours));
    }
}