package Factory;

import Factory.Pizza.Pizza;

public abstract class PizzaStore {
    public Pizza OrderPizza(String pizzaType){
        Pizza pizza;
        pizza = CreatePizza(pizzaType);

        pizza.Prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();
        return pizza;
    }

    public abstract Pizza CreatePizza(String pizzaType);
}
