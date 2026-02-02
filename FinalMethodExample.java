class Parent {
    final void display() {
        System.out.println("Final method in parent class");
    }
}

class Child extends Parent {
    // Cannot override display() because it is final in Parent
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
