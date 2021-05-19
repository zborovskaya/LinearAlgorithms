package entities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ThirtyFifthTask {
    static final Logger logger = LogManager.getLogger(ThirtyFifthTask.class.getName());
    private double m;
    private double n;

    public void setM(double m) {
        this.m = m;
    }

    public void setN(double n) {
        this.n = n;
    }

    public void calculate() {

        double result = (double) m / n;

        int younger = (int) (result % 10);
        int older = (int) ((result * 10) % 10);
        System.out.println(m + " / " + n + " = " + result);
        System.out.println("The most significant digit of the fractional part: " + older);
        System.out.println("Least significant digit of integer part: " + younger);
        System.out.println();
    }
}