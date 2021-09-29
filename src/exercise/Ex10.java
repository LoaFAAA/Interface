package exercise;
import exercise.Note;

interface Playable {
    void play(Note n);
}
interface Instrument1 {
    int vulue = 5;
    void adjust();
}

class Wind1 implements Instrument1,Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Percussion1 implements Instrument1,Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed1 implements Instrument1,Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}

class Brass1 extends Wind1 {
    public String toString() { return "Brass"; }
}

class Woodwind1 extends Wind1 {
    public String toString() { return "Woodwing"; }
}

public class Ex10 {
    // Doesn't care about type, so new types
    // added to the system will work right:
    static void tune(Playable i) {
        //...//用接口数组作为形参，只要是继承过这个接口的参数都可以传递进来
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        //用接口数组作为形参，只要是继承过这个接口的参数都可以传递进来
        for(Playable i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Playable[] orchestra = {
                new Wind1(),
                new Percussion1(),
                new Stringed1(),
                new Brass1(),
                new Woodwind1()
        };
        tuneAll(orchestra);
    }
}