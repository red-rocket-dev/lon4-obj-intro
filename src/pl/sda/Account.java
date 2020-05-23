package pl.sda;

import java.math.BigDecimal;

public class Account {
    private String name;
    private String surname;
    private String accountNumber;
    private BigDecimal money;


    public Account(String name, String surname, String accountNumber, BigDecimal money) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getMoney() {
        return money;
    }
}
