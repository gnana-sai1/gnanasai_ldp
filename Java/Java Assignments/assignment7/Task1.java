package com.core.java.assignment7;

abstract class Rodent{

    void info(){
        System.out.println("I'm from mammal family");
    }

    abstract void eat();

    void sleep(){
        System.out.println("Rodent is sleeping");
    }
}

class Mouse extends Rodent{

    @Override
    void eat() {
        System.out.println("Mouse is eating");
    }
}

class Gerbil extends Rodent{


    @Override
    void eat() {
        System.out.println("Gerbil is eating");
    }
}

class Hamster extends Rodent{

    @Override
    void eat() {
        System.out.println("Hamster is eating");
    }
}


public class Task1 {
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[3];
        rodents[0]=new Mouse();
        rodents[1] = new Gerbil();
        rodents[2]= new Hamster();

        for(int i=0;i<3;i++){
            rodents[i].info();
            rodents[i].eat();
            rodents[i].sleep();
            System.out.println();
        }
    }
}
