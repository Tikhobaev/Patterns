package Strategy.Ducks;

import Strategy.Quack.Squeak;
import Strategy.Fly.FlyNoWay;

public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehaviour = new Squeak();
    }
}
