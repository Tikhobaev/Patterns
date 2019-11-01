package Factory;

import Factory.Pizza.*;

public class NyPizzaStore extends PizzaStore {
    public Pizza CreatePizza(String pizzaType){
        if (pizzaType.equals("Cheese")){
            return new NyCheesePizza();
        }
        if (pizzaType.equals("Veggie")){
            return new NyVeggiePizza();
        }
        return null;
    }
}
