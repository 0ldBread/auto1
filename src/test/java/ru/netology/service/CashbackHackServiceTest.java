package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain1() {

        CashbackHackService service = new CashbackHackService();
        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);

    }

    @Test
    public void testRemain2() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void testRemain3() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);

    }

    @Test
    public void testRemain4() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);

    }

    @Test
    public void testRemain5() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }
}