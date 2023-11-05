package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testLessThanMultiple() {
        CashbackHackService cashbackService = new CashbackHackService();
        int purchase = 900;

        int actual = cashbackService.remain(purchase);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testMoreThanMultiple() {
        CashbackHackService cashbackService = new CashbackHackService();
        int purchase = 1100;

        int actual = cashbackService.remain(purchase);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    public void testEqualThanMultiple() {
        CashbackHackService cashbackService = new CashbackHackService();
        int purchase = 1000;

        int actual = cashbackService.remain(purchase);
        int expected = 0;

        assertEquals(expected, actual);
    }
}