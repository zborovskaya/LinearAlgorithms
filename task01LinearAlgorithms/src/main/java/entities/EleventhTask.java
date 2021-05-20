package entities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class EleventhTask {
    static final Logger logger = LogManager.getLogger(EleventhTask.class.getName());
    private double a;
    private double b;
    private boolean bool=true;

    public void setA(double value) {
        if(value > 0) {
            a = value;
        } else {
            bool=false;
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
    public double getPerimeter() {
        if (bool) {
            double c = Math.sqrt(a * a + b * b); // hypotenuse
            double p = a + b + c;
            return p;
        }
        else {
            logger.error("Can't find the perimeter");
            return 0;
        }
    }
    public double getSquare(){
        if (bool) {
            double s = a*b/2;
            return s;
        }
        else {
            logger.error("Can't find the square");
            return 0;
        }

    }

}
