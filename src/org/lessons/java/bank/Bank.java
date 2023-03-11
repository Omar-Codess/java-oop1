package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args){



        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome:");
        String userName = scan.nextLine();

        Conto conto = new Conto(userName);
        System.out.println(conto.getAccountNum());

        System.out.println("Menù: digita 1 per versare denaro; digita 2 per prelevare denaro; digita 3 per uscire");
        int userInput = scan.nextInt();

        while (userInput == 1 || userInput == 2) {
            if (userInput == 1) {
                System.out.println("Quanti soldi desideri versare?");
                double addedSum = scan.nextDouble();
                conto.addMoney(addedSum);
                System.out.println("Operazione riuscita! Ora il tuo saldo è: " + conto.getBalance());
                System.out.println("Menù: digita 1 per versare denaro; digita 2 per prelevare denaro; digita 3 per uscire");
                userInput = scan.nextInt();
            } else if (userInput == 2) {
                System.out.println("Quanti soldi vuoi prelevare?");
                double withdrawnMoney = scan.nextDouble();
                conto.withdrawMoney(withdrawnMoney);
                System.out.println("Menù: digita 1 per versare denaro; digita 2 per prelevare denaro; digita 3 per uscire");
                userInput = scan.nextInt();
            }
        }

        if (userInput == 3){
            System.out.println("Arrivederci!");
        }
    }
}

