package BeachPractics;

abstract class Vechicle {
    abstract void start();

    String msg;

    Vechicle(String msg)
    {
        this.msg=msg;
    }
    void car()
    {
        System.out.println("Car is running");
    }
}
class Honda extends Vechicle {
    Honda() {
        super("Honda");
    }

    void start() {
        System.out.println("Honda is starting");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Vechicle v = new Honda();
        v.start();
        v.car();
    }
}
