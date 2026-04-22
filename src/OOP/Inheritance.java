package OOP;
import OOP.car;

public class Inheritance {
    static void main() {
        car c = new car("Maruti","800",4,5,"Automatic");
               c.startEngine();
               c.stopEngine();
               c.startAc();


        MotorCycle m = new MotorCycle("Splendor","ct100",2,2,"no");
                        m.startEngine();
                        m.stopEngine();
                        m.wheelie();

    }
}