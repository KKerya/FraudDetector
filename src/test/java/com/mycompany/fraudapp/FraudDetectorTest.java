package com.mycompany.fraudapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudRule1Test {

    private final FraudRule fraudRule = new FraudRule1();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Pokemon", "Random", "Random");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction).getFraud());
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Zorro", "Random", "Random");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction).getFraud());
    }

}

class FraudRule2Test {

    private final FraudRule fraudRule = new FraudRule2();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Random", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTrue(fraudRule.isFraud(transaction).getFraud());
    }

    @Test
    public void shouldNotBeFraud_1000000() {
        Trader trader = new Trader("Random", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000000);
        assertFalse(fraudRule.isFraud(transaction).getFraud());
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Random", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 10);
        assertFalse(fraudRule.isFraud(transaction).getFraud());
    }

}

class FraudRule3Test {

    private final FraudRule fraudRule = new FraudRule3();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("John", "Sydney", "Italy");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction).getFraud());
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("John", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction).getFraud());
    }

}

class FraudRule4Test {

    private final FraudRule fraudRule = new FraudRule4();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Random", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction).getFraud());
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Random", "Kingston", "Italy");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction).getFraud());
    }

}

class FraudRule5Test {

    private FraudRule fraudRule = new FraudRule5();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Random", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTrue(fraudRule.isFraud(transaction).getFraud());
    }

    @Test
    public void shouldNotBeFraud_1000() {
        Trader trader = new Trader("Random", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudRule.isFraud(transaction).getFraud());
    }

    @Test
    public void shouldNotBeFraud_LessThan_1000() {
        Trader trader = new Trader("Random", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 10);
        assertFalse(fraudRule.isFraud(transaction).getFraud());
    }

    @Test
    public void shouldNotBeFraud_OtherCountry() {
        Trader trader = new Trader("Random", "Berlin", "Italy");
        Transaction transaction = new Transaction(trader, 1001);
        assertFalse(fraudRule.isFraud(transaction).getFraud());
    }

}

class FraudRule6Test {

    private final FraudRule fraudRule = new FraudRule6();

    @Test
    public void shouldBeFraudWhenAmountExceedsLimit(){
        Trader trader = new Trader("Aleksandr", "Moscow", "Russian", 1000);
        Transaction transaction = new Transaction(trader, 1000000);
        assertTrue(fraudRule.isFraud(transaction).getFraud());
    }
}
