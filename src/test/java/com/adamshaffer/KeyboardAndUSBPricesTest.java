package com.adamshaffer;

import org.junit.jupiter.api.BeforeEach;

public class KeyboardAndUSBPricesTest {
    private KeyboardAndUSBPrices keyboardAndUSBPrices;
    private PriceList priceListA;
    private PriceList priceListB;
    @BeforeEach
    public void setUp() throws Exception {
        keyboardAndUSBPrices = new KeyboardAndUSBPrices(new PriceList(new Integer[]{40, 50, 60}), new PriceList(new Integer[]{5, 8, 9}), 60);
    }
}