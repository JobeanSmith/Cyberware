package com.spring.henallux.cyberware.model;

import com.spring.henallux.cyberware.model.Item;
import com.spring.henallux.cyberware.model.Purchase;

import javax.validation.constraints.*;

public class PurchaseLine {
    private Integer identifier;
    @NotNull
    @Min(value = 0)
    private Double itemPrice;
    @NotNull
    @Min(value = 1)
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