package Decorator.ConcreteBeverages;

import Decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf(){
        Description = "Decaf";
    }
    public double Cost(){
        return 0.8;
    }
}
