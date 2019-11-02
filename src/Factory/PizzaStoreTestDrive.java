package Factory;

import Factory.Pizza.Pizza;

public class PizzaStoreTestDrive {
    public static void main(String[] args){
        PizzaStore NyStore = new NyPizzaStore();
        Pizza cheesePizza = NyStore.OrderPizza("Cheese");
        Pizza veggiePizza = NyStore.OrderPizza("Veggie");
    }
}
