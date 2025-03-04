package OOPS;

//base class

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// derived class
// class fish extends Animal {
// int fins;

// void swim() {
// System.out.println("swim in water");

// }
// }

class Mammals extends Animal {
    // int legs;
    void walk() {
        System.out.println("walk");
    }

}

class Bird extends Animal {

    void fly() {
        System.out.println("fly");
    }

}

// class Dog extends Mammals {
// String bread;

// }

public class inheritance {
    public static void main(String[] args) {
        // fish shark = new fish();
        // shark.eat();

        // Dog dobby = new Dog();

        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

    }

}
