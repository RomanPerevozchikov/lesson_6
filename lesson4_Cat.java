package ru.geekbrains.lesson4;

public class Cat extends Animal {
    public Cat(String name) {
        setName(name);
        this.distRun = random.nextInt(50) + 150;
    }

    @Override
    public void swim(int s) {
        System.out.println(this.name + ": Я кот и не умею плавать!");
    }


}

