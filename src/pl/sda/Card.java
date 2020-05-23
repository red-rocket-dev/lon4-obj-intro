package pl.sda;

import java.time.LocalDate;

public class Card {
    private String number;
    private String brand;
    private LocalDate expiryDate;
    private String pin;
    private Account account;
    private static int counter;

    public Card(String number, String brand, LocalDate expiryDate, String pin, Account account) {
        this.number = number;
        this.brand = brand;
        this.expiryDate = expiryDate;
        this.pin = pin;
        this.account = account;
        counter ++;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getPin() {
        return pin;
    }

    public static int getCounter() {
        return counter;
    }

    public Account getAccount() {
        return account;
    }
}
