package Decorator;

public abstract class Beverage {
    protected String Description = "Unknown beverage";
    public String GetDescription(){
        return Description;
    }
    public abstract double Cost();
}
