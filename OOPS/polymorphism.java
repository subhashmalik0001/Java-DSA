package OOPS;

public class polymorphism {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();

        // System.out.println(calc.sum(5, 9));
        // System.out.println(calc.sum((float) 5.5, (float) 8.3));
        // System.out.println(calc.sum(5, 9, 2));
        // }
        Deer d = new Deer();
        d.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}

// meth overloding
class Calculator {
    int sum(int a, int b) {
        return a + b;

    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}
