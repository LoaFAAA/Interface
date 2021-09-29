package exercise;
import Reusing.*;

public class Ex5 implements Inf{
    public void play() {
        System.out.println("hi");
    }
    public void adjust() {
        System.out.println("hi");
    }
    public void say(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Ex5 m = new Ex5();
        m.play();
        m.adjust();
        m.say("hi");
    }
}
