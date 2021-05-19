package entities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class EleventhTask {
    static final Logger logger = LogManager.getLogger(EleventhTask.class.getName());
    private double a;
    private double b;

    public void setA(double value) {
        if(value > 0) {
            a = value;
        } else {
            logger.error("Negative leg a!");
        }
    }
    public double getA() {
        return a;
    }
    public void setB(double value) {
        if(value > 0) {
            b = value;
        } else {
            logger.error("Negative leg a!");
        }
    }
    public double getB() {
        return b;
    }
    public double getPerimeter(){
        double c = Math.sqrt(a*a + b*b); // hypotenuse
        double p = a + b + c;
        return p;
    }
    public double getSquare(){
        double s = a*b/2;
        return s;
    }

}
