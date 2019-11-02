package Factory.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String Name;
    String Dough;
    String Sause;
    ArrayList toppings = new ArrayList();
    public void Prepare(){
        System.out.println("Preparing" + Name);
        System.out.println("Tossing Dough " + Dough);
        System.out.println("Adding Sause " + Sause);
        System.out.println("Adding toppings:");
        for(int i = 0 ; i < toppings.size(); i++){
            System.out.println(toppings.get(i));
        }
    }
    public void Bake(){
        System.out.println("Bake " + Name);
    }
    public void Cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void Box(){
        System.out.println("Place pizza in box");
    }
    public String GetName(){
        return Name;
    }
}
