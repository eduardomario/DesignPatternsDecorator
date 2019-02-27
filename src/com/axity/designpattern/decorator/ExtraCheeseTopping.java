package com.axity.designpattern.decorator;

public class ExtraCheeseTopping extends ToppingsDecorator {

    public ExtraCheeseTopping(BasePizza pizzaToDecorate) {
        super(pizzaToDecorate);
        this.myPrice = 0.99;
    }
}
