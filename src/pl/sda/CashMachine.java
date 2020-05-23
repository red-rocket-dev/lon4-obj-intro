package pl.sda;

import java.math.BigDecimal;

public class CashMachine {
    private BigDecimal moneyInside;

    public BigDecimal checkBalance(String pin, Card card) {
        if (pin.equals(card.getPin())) {
            return card.getAccount().getMoney();
        } else {
            return null;
        }
    }
}
