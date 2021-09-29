package exercise;

interface FastFood {
    void cheeseburger();
    void fries();
    void softDrink();
}

class Meal {
    Meal() {System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()"); }
}

class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}

class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()"); }
}

public class Ex8 extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lunch l = new Lunch();
    public Ex8() { System.out.println("Sandwich8()"); }
    public void cheeseburger() {
        System.out.println("Cheeseburger");
    }
    public void fries() {
        System.out.println("Fries");
    }
    public void softDrink(){
        System.out.println("Soft Drink");
    }
    public static void main(String[] args) {
        Ex8 s = new Ex8();
        s.cheeseburger();
        s.fries();
        s.softDrink();

    }
}