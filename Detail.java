package com.company;
public class Detal {
    private String mark;
    private int cost;
    private String type;
    private int quantity;

    public String getMark() { return mark; }
    public int getCost() { return cost; }
    public String getType() { return type; }
    public int getQuantity() { return quantity; }
    
    public void setMark(int mark) { this.mark = mark; }
    public void setCost(int sallary) { this.cost = sallary; }
    public void setType(String type) { this.type = type; }
    public void setQuantity(String quantity) { this.quantity = quantity; }
    public Detal() {
        this.mark = mark;
        this.cost = cost;
        this.type = type;
        this.quantity = quantity;
    }
}
