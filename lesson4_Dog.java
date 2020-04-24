package ru.geekbrains.lesson4;

public class Dog extends Animal {

    public Dog(String name) {
        setName(name);
        this.distRun = random.nextInt(50) + 350;
        this.distSwim = 100;
    }

}

