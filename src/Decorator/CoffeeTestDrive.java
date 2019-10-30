package Decorator;

import Decorator.ConcreteBeverages.Espresso;
import Decorator.Condiments.Milk;
import Decorator.Condiments.Mocha;
import Decorator.Condiments.Whip;

public class CoffeeTestDrive {
    public static void main(String args[]){
        Beverage coffee = new Espresso();
        coffee = new Mocha(coffee);
        coffee = new Milk(coffee);
        coffee = new Whip(coffee);
        System.out.println("Your beverage is " + coffee.GetDescription());
        System.out.println("Cost: " + coffee.Cost() + "$");
    }
}
