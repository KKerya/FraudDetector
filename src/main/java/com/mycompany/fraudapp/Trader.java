package com.mycompany.fraudapp;

class Trader {

    private final String fullName;
    private String city;
    private String country;
    private int maxTransactionAmount = 1000;

    public Trader(String fullName, String city, String country){
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public Trader(String fullName, String city, String country, int maxTransactionAmount){
        this.fullName = fullName;
        this.city = city;
        this.country = country;
        this.maxTransactionAmount = maxTransactionAmount;
    }

    public String getFullName() { return fullName; }
    public String getCity() { return city; }
    public String getCountry() { return country; }
    public int getMaxTransactionAmount() { return maxTransactionAmount; }

}