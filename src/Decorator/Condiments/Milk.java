package Decorator.Condiments;

import Decorator.Beverage;

public class Milk extends Beverage {
    private Beverage beverage;
    private double cost = 0.1;

    public Milk(Beverage beverage){
        this.beverage = beverage;
        Description = "milk";
    }

    public String GetDescription() {
        return beverage.GetDescription() + " + " + Description;
    }

    public double Cost(){
        return beverage.Cost() + cost;
    }
}
