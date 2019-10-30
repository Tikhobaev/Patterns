package Strategy.Ducks;

import Strategy.Quack.Quack;
import Strategy.Fly.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehaviour = new Quack();
    }
}
