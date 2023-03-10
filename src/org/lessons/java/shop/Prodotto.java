package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    //CAMPI
    private int code;
    public String name;
    public String description;
    protected double price;
    protected double vat = 0.21;

    //COSTRUTTORE
    public Prodotto(){
        Random rdnCode = new Random();
        code = rdnCode.nextInt(10000);
    }
}
