package com.spring.henallux.cyberware.model.other;

import com.spring.henallux.cyberware.model.main.PurchaseLine;

import java.util.Collection;
import java.util.HashMap;

public class Cart {
    private HashMap<Integer, PurchaseLine> cart = new HashMap<>();

    public Cart() {}

    public HashMap<Integer, PurchaseLine> getCart() {
        return cart;
    }
    public void setCart(HashMap<Integer, PurchaseLine> cart) {
        this.cart = cart;
    }

    public Collection<PurchaseLine> getAllPurchaseLines() {
        return cart.values();
    }
}