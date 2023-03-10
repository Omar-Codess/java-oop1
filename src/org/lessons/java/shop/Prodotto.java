package org.lessons.java.shop;

public class Prodotto {
    //CAMPI
    public int code;
    public String name;
    public String description;
    protected double price;
    protected double vat;

    //COSTRUTTORE
    public Prodotto(){
        code = 1234;
        name = "accendino";
        description = "rosso, ricaricabile, lunga durata";
        price = 2;
        vat = 0.50;
    }
}
