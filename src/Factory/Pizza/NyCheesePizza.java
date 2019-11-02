package Factory.Pizza;

public class NyCheesePizza extends Pizza{
    public NyCheesePizza() {
        Name = "NY style sause and cheese pizza";
        Dough = "Thin crush dough";
        Sause = "Marinara sause";

        toppings.add("Grated Reggiano cheese");
    }
}
