package com.spring.henallux.cyberware.model;

import java.util.HashMap;

public class Cart {
    private HashMap<Item, Integer> cart = new HashMap<>();

    public Cart() {}

    public HashMap<Item, Integer> getCart() {
        return cart;
    }
    public void setCart(HashMap<Item, Integer> cart) {
        this.cart = cart;
    }

    public void addToCart() {

    }

    public void removeFromCart() {

    }
}
