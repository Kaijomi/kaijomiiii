package com.company;
public class Postavshchik {
    private String name;
    private String surname;
    private String lastname;
    private String address;
    private String phone;
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    
    public String getLastname() { return lastname; }
    public void setLastnam(String lastname) { this.lastname = lastname; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public String getPhone() { return phone; }
    public void setPhones(String phone) { this.phone = phone; }
    
    public Postavshchik(){
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
    }
}
