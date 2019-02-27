package com.axity.designpattern.decorator;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Client-code
        DecimalFormat df = new DecimalFormat("#.00");
        //Pizza1
        Margherita pizza = new Margherita();
        System.out.println("Plain Margherita: " + pizza.GetPrice());

        ExtraCheeseTopping moreCheese = new ExtraCheeseTopping(pizza);
        ExtraCheeseTopping someMoreCheese = new ExtraCheeseTopping(moreCheese);
        System.out.println("Plain Margherita with extra cheese: " + df.format(moreCheese.GetPrice()));
        System.out.println("Plain Margherita with double extra cheese: " + df.format(someMoreCheese.GetPrice()));

        MushroomTopping moreMushroom = new MushroomTopping(someMoreCheese);
        System.out.println("Plain Margherita with double extra cheese with mushroom: " + df.format(moreMushroom.GetPrice()));

        JalapenoTopping moreJalapeno = new JalapenoTopping(moreMushroom);
        System.out.println("Plain Margherita with double extra cheese with mushroom with Jalapeno: " + df.format(moreJalapeno.GetPrice()));

        //Pizza2
        Gourmet pizza2 = new Gourmet();
        System.out.println("Plain Gourmet: " + pizza2.GetPrice());

        ExtraCheeseTopping moreCheese2 = new ExtraCheeseTopping(pizza2);
        System.out.println("Plain Gourmet with extra cheese: " + df.format(moreCheese2.GetPrice()));

        MushroomTopping moreMushroom2 = new MushroomTopping(moreCheese2);
        System.out.println("Plain Gourmet with extra cheese with mushroom: " + df.format(moreMushroom2.GetPrice()));

        JalapenoTopping moreJalapeno2 = new JalapenoTopping(moreMushroom2);
        System.out.println("Plain Gourmet with extra cheese with mushroom with Jalapeno: " + df.format(moreJalapeno2.GetPrice()));
    }
}
