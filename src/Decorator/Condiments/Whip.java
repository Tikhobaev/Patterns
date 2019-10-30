package Decorator.Condiments;

import Decorator.Beverage;

public class Whip extends Beverage {
    private Beverage beverage;
    private double cost = 0.2;

    public Whip(Beverage beverage){
        this.beverage = beverage;
        Description = "whip";
    }

    public String GetDescription() {
        return beverage.GetDescription() + " + " + Description;
    }

    public double Cost(){
        return beverage.Cost() + cost;
    }
}
