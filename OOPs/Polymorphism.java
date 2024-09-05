class Animal {
    public void A(){
        System.out.println("In method A");
    }
    public void B(){
        System.out.println("In method B");
    }
    public void C(){
        System.out.println("In method C");
    }
}

class Cat extends Animal{
    public void C(){
        System.out.println("In method of C of Cat Class");
    }
    public void D(){
        System.out.println("In method D");
    }
    public void E(){
        System.out.println("In method E");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.A();
        // animal.D();// Throws error
        Animal newAnimal = new Cat();
        newAnimal.C(); // newAnimal can access A, B, C(overriden method)

        Cat c = new Cat();
        c.A(); // C has access to A, B, C, D, E methods
    }
}


