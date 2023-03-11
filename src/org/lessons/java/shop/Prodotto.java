package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    //CAMPI
    private int code;
    public String name;
    public String description;
    protected double price;
    protected double vat = 0.22;

    //COSTRUTTORE

    //Codice valorizzato con numero random
    public Prodotto(){
        Random rdnCode = new Random();
        code = rdnCode.nextInt(10000);
    }

    //Metodo per avere il prezzo base
    public double getPrice(){
        return price;
    }

    //Metodo per avere il prezzo finale
    public double getFullPrice(){
        return price = (price * vat) + price;
    }

    //Metodo per settare il nome
    public String setName(String newName) {
        return this.name = newName;
    }

    //Metodo per ottenere il nome con il codice
    public String getFullName(){
        return code + name;
    }

}









