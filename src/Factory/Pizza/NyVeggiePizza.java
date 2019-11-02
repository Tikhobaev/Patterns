package Factory.Pizza;

public class NyVeggiePizza extends Pizza {
    public NyVeggiePizza(){
        Name = "NY style sause and veggie pizza";
        Dough = "Extra thick crush dough";
        Sause = "Plum tomato sause";

        toppings.add("Shredded mozzarela cheese");
    }
}
