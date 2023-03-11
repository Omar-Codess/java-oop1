package org.lessons.java.shop;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Prodotto test = new Prodotto();

        test.name = "Accendino";
        test.description = "Rosso, leggero e compatto";
        test.price = 2.10;

        System.out.println(test.setName("Ombrello"));
        System.out.println(test.getFullName());
        System.out.println(test.getPrice());
        System.out.println(test.getFullPrice());

    }
}
