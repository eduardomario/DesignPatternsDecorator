package com.axity.designpattern.decorator;

public class MushroomTopping extends ToppingsDecorator {
    public MushroomTopping(BasePizza pizzaToDecorate) {
        super(pizzaToDecorate);
        this.myPrice = 1.49;
    }
}
