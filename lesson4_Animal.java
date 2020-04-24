package ru.geekbrains.lesson4;

import java.util.Random;

public class Animal {
    public Random random = new Random();
    protected int distRun;
    protected int distSwim;

    public Animal () {

    }
    protected String name;

    protected void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public void run (int r) {
        if (this.distRun >= r) System.out.println(this.name + ": Я пробежал " + r + " метров");
        else System.out.println(this.name + ": Я не могу так далеко убежать...");
    }

    public void swim (int s) {
        if (this.distSwim >= s) System.out.println(this.name + ": Я проплыл " + s + " метров");
        else System.out.println(this.name + ": Я не могу так далеко уплыть...");
    }


}
