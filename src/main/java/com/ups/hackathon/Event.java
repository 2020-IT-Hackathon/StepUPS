package com.ups.hackathon;

import java.util.List;
import java.util.ArrayList;

public class Event {

    private String eventName;
    private String location;
    private String date;
    private double hours;

    public Event(String eventName, String location, String date, double hours) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }
}