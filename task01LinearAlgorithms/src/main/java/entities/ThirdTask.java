package entities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ThirdTask {
    static final Logger logger = LogManager.getLogger(ThirdTask.class.getName());
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * The function finds the value of an expression z=2*x+(y-2)*5
     */

    public double calculate() {
       double z=2*x+(y-2)*5;
        return z;

    }
}
