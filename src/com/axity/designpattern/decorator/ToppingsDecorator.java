package com.axity.designpattern.decorator;

public abstract class ToppingsDecorator extends BasePizza {
    protected BasePizza pizza;
    public ToppingsDecorator(BasePizza pizzaToDecorate) {
        this.pizza = pizzaToDecorate;
    }

    public double GetPrice() {
        return (this.pizza.GetPrice() + this.myPrice);
    }
}
