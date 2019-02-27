package com.axity.designpattern.decorator;

public class JalapenoTopping extends ToppingsDecorator {
    public JalapenoTopping(BasePizza pizzaToDecorate) {
        super(pizzaToDecorate);
        this.myPrice = 1.49;
    }
}
