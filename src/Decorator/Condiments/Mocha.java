package Decorator.Condiments;

import Decorator.Beverage;
import Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    private double cost = 0.3;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
        Description = "mocha";
    }

    public String GetDescription() {
        return beverage.GetDescription() + " + " + Description;
    }

    public double Cost(){
        return beverage.Cost() + cost;
    }
}
