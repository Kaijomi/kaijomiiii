package com.company;
public class Shop {
    private int id_postavshchik;
    private int id_client;
    private int PurchaseNumber;

    public int getId_postavshchik() { return id_postavshchik; }
    public int getId_client() { return id_client; }
    public int getPurchaseNumber() { return PurchaseNumber; }

    public void setId_postavshchik(int id_postavshchik) { this.id_postavshchik = id_postavshchik; }
    public void setId_client(int id_client) { this.id_client = id_client; }
    public void setPurchaseNumber(int PurchaseNumber) { this.PurchaseNumber = PurchaseNumber; }

    public Shop () {
        this.id_postavshchik = id_postavshchik;
        this.id_client = id_client;
        this.PurchaseNumber = PurchaseNumber;
    }
}
