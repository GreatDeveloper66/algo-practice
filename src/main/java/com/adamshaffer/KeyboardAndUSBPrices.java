package com.adamshaffer;

// A person wants to determine the most expensive computer keyboard 
// and USB drive that can be purchased with a give budget. 
// Given price lists for keyboards and USB drives and a budget, 
// find the cost to buy them. If it is not possible to buy both items, return -1.


// Example

// b = 60
// keyboards[0] = 40
// keyboards[1] = 50
// keyboards[2] = 60
// usb[0] = 5
// usb[1] = 8
// usb[2] = 9
// The person can buy a 40 keyboard + 9 USB drive, or a 50 keyboard + 8 USB drive. 
// Choose the latter as the more expensive option and return 50 + 8 = 58.

public class KeyboardAndUSBPrices {
    private PriceList keyboardPrices;
    private PriceList usbPrices;
    private Integer budget;

    public KeyboardAndUSBPrices(PriceList keyboardPrices, PriceList usbPrices, Integer budget) {
        this.keyboardPrices = keyboardPrices;
        this.usbPrices = usbPrices;
        this.budget = budget;
    }

    private PriceList EliminateCheapestInList(PriceList list) {
        //remove the lowest price in the list
        int min = list.getMin();
        list.removeElement(min);
        return list;
    }

    public Integer findMostExpensiveKeyboardAndUSBWithinBudget() {

    }
}
