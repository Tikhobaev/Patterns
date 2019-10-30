package Decorator.ConcreteBeverages;

import Decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        Description = "HouseBlend";
    }

    public double Cost(){
        return 2.3;
    }
}
