package Strategy.Ducks;

import Strategy.Fly.FlyBehavior;
import Strategy.Quack.QuackBehaviour;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehaviour quackBehaviour;

    public void PerformFly(){
        flyBehavior.Fly();
    }

    public void PerformQuack(){
        quackBehaviour.Quack();
    }

    public void Swim(){
        System.out.println("Life is cool by the pool");
    }
}
