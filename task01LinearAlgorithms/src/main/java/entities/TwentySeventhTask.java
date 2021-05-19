package entities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TwentySeventhTask {
    static final Logger logger = LogManager.getLogger(TwentySeventhTask .class.getName());
    private double a;

    public void setA(double value) {
            a = value;
    }
    public double getA() {
        return a;
    }

    public void calculate() {
        double a2 = a * a;
        double a4 = a2 * a2;
        double a8 = a4 * a4;
        double a10 = a8 * a2;
        System.out.println("a = " + a + "\nа8 = " + a8 + " and а10 = " + a10);
    }
}
