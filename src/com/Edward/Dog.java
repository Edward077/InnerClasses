package com.Edward;

public class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("woooo, wooo");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("weak");
    }
}
