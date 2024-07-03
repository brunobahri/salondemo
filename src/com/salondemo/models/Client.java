package com.salondemo.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Client {
    private String name;
    private String phoneNumber;
    private LocalDate date;
    private LocalTime time;

    public Client(String name, String phoneNumber, LocalDate date, LocalTime time) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.time = time;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
