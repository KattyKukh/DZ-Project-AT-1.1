package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldNotOfferToPayIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;
        int actual = service.remain(amount);
        assertEquals(0,actual);
    }
    @org.junit.Test
    public void shouldOfferToPay200IfAmountIs1800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1800;
        int actual = service.remain(amount);
        assertEquals(200,actual);
    }
    @org.junit.Test
    public void shouldOfferToPay700IfAmountIs300() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int actual = service.remain(amount);
        assertEquals(700,actual);
    }
}