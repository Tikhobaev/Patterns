package Strategy;

import Strategy.Ducks.MallardDuck;
import Strategy.Ducks.RubberDuck;
import Strategy.Ducks.Duck;

public class DuckTest {
    static void Test(){
        Duck mduck = new MallardDuck();
        Duck rduck = new RubberDuck();
        mduck.PerformFly();
        mduck.PerformQuack();
        mduck.Swim();
        rduck.PerformFly();
        rduck.PerformQuack();
        rduck.Swim();
    }
}
