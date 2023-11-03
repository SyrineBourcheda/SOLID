package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(QuackAndSwim... ducks)
    {
        for (QuackAndSwim duck : ducks) {
            duck.quack();
        }
    }

    private void swim(QuackAndSwim... ducks)
    {
        for (QuackAndSwim duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
