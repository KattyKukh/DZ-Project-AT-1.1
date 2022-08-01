package ru.netology.service;

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
    @org.junit.jupiter.api.Test
    public void shouldOfferToPay400IfAmountIs1600() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1600;
        int actual = service.remain(amount);
        assertEquals(400,actual);
    }
    @org.junit.jupiter.api.Test
    public void shouldOfferToPay150IfAmountIs850() {
        CashbackHackService service = new CashbackHackService();
        int amount = 850;
        int actual = service.remain(amount);
        assertEquals(150,actual);
    }
}