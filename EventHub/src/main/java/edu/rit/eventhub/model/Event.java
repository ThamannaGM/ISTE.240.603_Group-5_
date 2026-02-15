package edu.rit.eventhub.model;

import org.springframework.stereotype.Component;

@Component
public class Event {
    private String companyName;
    private String title;
    private String description;
    private String date;
    private String location;
    private int capacity;
    private int eventId;

    public String getCompanyName() {return companyName;}

    public String getTitle() {return title;}

    public String getDescription() {return description;}

    public String getDate() {return date;}

    public String getLocation() {return location;}

    public int getCapacity() {return capacity;}

    public int getEventId() {return eventId;}

    public void setCompanyName(String companyName) {this.companyName = companyName;}

    public void setTitle(String title) {this.title = title;}

    public void setDescription(String description) {this.description = description;}

    public void setDate(String date) {this.date = date;}

    public void setLocation(String location) {this.location = location;}

    public void setCapacity(int capacity) {this.capacity = capacity;}

    public void setEventId(int eventId) {this.eventId = eventId;}
}
