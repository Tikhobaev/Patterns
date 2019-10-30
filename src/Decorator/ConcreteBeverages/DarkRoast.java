package Decorator.ConcreteBeverages;

import Decorator.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        Description = "Dark roast";
    }
    public double Cost(){
        return 1.4;
    }
}
