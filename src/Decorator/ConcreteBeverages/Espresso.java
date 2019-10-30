package Decorator.ConcreteBeverages;


import Decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        Description = "Espresso";
    }
    public double Cost(){
        return 1.2;
    }
}
