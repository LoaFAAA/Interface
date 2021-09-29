package exercise;

abstract class Dad1 {
}

class Son1 extends Dad1 {
    protected void print() { System.out.println("Son1"); }
}

abstract class SecondDad {
    abstract protected void print();
}

class SecondSon extends SecondDad {
    protected void print() { System.out.println("SecondSon"); }
}

public class Ex4 {
    public static void testPrint(Dad1 d) {
        ((Son1)d).print();
    }
    public static void secondTestPrint(SecondDad sd) {
        sd.print();
    }
    public static void main(String[] args) {
        Son1 s = new Son1();
        Ex4.testPrint(s);
        SecondSon ss = new SecondSon();
        Ex4.secondTestPrint(ss);
    }
}