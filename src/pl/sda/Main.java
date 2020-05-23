package pl.sda;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        /*
        Naszym zadaniem jest stworzenie kodu obsługującego bankomat. Powinien obsługiwać akcje takie jak:
        * Wpłacenie gotówki
        * Wybranie gotówki
        * Sprawdzenie stanu konta
         */
        // Klasy:
        // CashMachine
        // Account
        // Card (karta jest połączo:na z jednym kontem)
        //TODO: cwiczenia z bigdecimal
        double test = 1.03 - 0.42;
//12-12-2026
        Account account = new Account("Jakub",
                "Płonka",
                "PL41109024027856121167925782",
                BigDecimal.valueOf(112));
        new Card("4532988042633987",
                "VISA",
                LocalDate.of(2026, 12, 12),
                "1234",
                account);
        System.out.println(test);
    }
}
