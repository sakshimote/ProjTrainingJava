package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BankAccountTest {
	
	@Test
    public void withdrawShouldThrowInsufficientFundsExceptionWhenBalanceIsInsufficient() {
        BankAccount account = new BankAccount(100);

        assertThrows(InsufficientFundsException.class, () -> account.withdraw(150));
    }

    @Test
    public void withdrawShouldDeductAmountFromBalanceWhenBalanceIsSufficient() throws InsufficientFundsException {
        BankAccount account = new BankAccount(100);

        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

}
