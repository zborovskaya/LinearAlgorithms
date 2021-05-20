package entities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class NineteenthTask {
    static final Logger logger = LogManager.getLogger(NineteenthTask.class.getName());
    private double a;
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

    public double getSquare(){
        if (bool) {
            double s = (a * a * Math.sqrt(3)) / 4;
            return s;
        }
        else {
            logger.error("Can't find the square");
            return 0;
        }
    }
    public double getHeight(){
        if (bool) {
            double h = a * Math.sqrt(3) / 2;
            return h;
        }
        else {
            logger.error("Can't find the Height");
            return 0;
        }
    }
    public double getRadiusIn(){
        if (bool) {
            double r = a * Math.sqrt(3) / 6;
            return r;
        }
        else {
            logger.error("Can't find the Inscribed circle radius");
            return 0;
        }
    }
    public double getRadiusOut(){
        if (bool) {
            double r = a * Math.sqrt(3) / 3;
            return r;
        }
        else {
            logger.error("Radius of the circumscribed circle");
            return 0;
        }
    }
}
