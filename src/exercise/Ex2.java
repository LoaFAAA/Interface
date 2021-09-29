package exercise;

abstract class Nogo1 {
    abstract void nogo1();
    abstract void Nogo1();
}
abstract class Nogo2 {}

class go extends  Nogo1{
    void nogo1() {
        System.out.println("go1()");
    }
    void Nogo1() {
        System.out.println("go()");
    }
}
class go1 extends Nogo1{
    void nogo1() {
        System.out.println("go1()");
    }

    @Override
    void Nogo1() {

    }
}
public class Ex2 {
    public static void main(String[] args) {
        //Nogo1 a = new Nogo1();抽象类无法实例化
        //Nogo2 b = new Nogo2();抽象类无法实例化
        go      c = new go();//重写所有抽象类的方法后才能实例化。
        go1     d = new go1();//只重写一部分是不能实例化的。
    }
}
