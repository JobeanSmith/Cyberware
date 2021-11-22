package com.spring.henallux.cyberware.model;

import javax.validation.constraints.*;

public class PurchaseLine {
    @NotNull
    private Integer identifier;
    @NotNull
    private Double itemPrice;
    @NotNull
    private Integer requestedQuantity;
    @NotNull
    private Item item;
    @NotNull
    private Purchase purchase;

    public PurchaseLine() {}

    public Integer getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public Double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getRequestedQuantity() {
        return requestedQuantity;
    }
    public void setRequestedQuantity(Integer requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }

    public Purchase getPurchase() {
        return purchase;
    }
    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}