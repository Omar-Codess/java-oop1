package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Conto {
    private int accountNum;
    private String userName;
    private double balance;

    public Conto(String userName) {
        balance = 0.00;
        Random rdnCode = new Random();
        accountNum = rdnCode.nextInt(1001);
    }

    public String getBalance() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return decimalFormat.format(balance);
    }

    public String getUserName() {
        return userName;
    }

    public String setUserName(String newUserName) {
        return this.userName = newUserName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public double addMoney(double addedSum) {
        return balance = balance + addedSum;
    }


    public double withdrawMoney(double withdrawnMoney) {
        if (withdrawnMoney > balance) {
            System.out.println("Operazione non riuscita! Saldo insufficiente.");
        } else {
            balance = balance - withdrawnMoney;
            System.out.println("Operazione riuscita! Ora il tuo saldo è: " + getBalance());

        }
        return balance;
    }
}
