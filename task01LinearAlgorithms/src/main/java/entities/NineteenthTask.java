package entities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class NineteenthTask {
    static final Logger logger = LogManager.getLogger(NineteenthTask.class.getName());
    private double a;
    public void setA(double value) {
        if(value > 0) {
            a = value;
        } else {
            System.out.println("Negative leg a!");
        }
    }
    public double getA() {
        return a;
    }

    public double getSquare(){
        double s = (a * a * Math.sqrt(3)) / 4;
        return s;
    }
    public double getHeight(){
        double h = a * Math.sqrt(3) / 2;
        return h;
    }
    public double getRadiusIn(){
        double r = a * Math.sqrt(3) / 6;
        return r;
    }
    public double getRadiusOut(){
        double r = a * Math.sqrt(3) / 3;
        return r;
    }
}
