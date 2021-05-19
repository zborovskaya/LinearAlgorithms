package control;

import java.util.Scanner;

import entities.ThirdTask;
import entities.EleventhTask;
import entities.NineteenthTask;
import entities.TwentySeventhTask;
import entities.ThirtyFifthTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    // Logger instance named "Runner".
    private static final Logger logger = LogManager.getLogger(Runner.class);

    public static void showMenu() {
        System.out.println("Menu: ");
        System.out.println("1) Task 3");
        System.out.println("2) Task 11");
        System.out.println("3) Task 19");
        System.out.println("4) Task 27");
        System.out.println("5) Task 35");
        System.out.println("6) Exit");
        System.out.println("Choose task: ");
    }

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            showMenu();
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter x and press <Enter> & y and press <Enter>:");
                    double x = scan.nextDouble();
                    double y = scan.nextDouble();
                    System.out.println("x=" + x+" y="+y);
                    ThirdTask thirdTask= new ThirdTask();
                    thirdTask.setX(x);
                    thirdTask.setY(y);
                    System.out.println("Z = " + thirdTask.calculate());
                    break;
                }
                case 2: {
                    System.out.println("Enter a and press <Enter> & number and b <Enter>:");
                    double a = scan.nextDouble();
                    double b = scan.nextDouble();
                    EleventhTask eleventhTask = new EleventhTask();
                    eleventhTask.setA(a);
                    eleventhTask.setB(b);
                    System.out.println("Perimeter is " + eleventhTask.getPerimeter());
                    System.out.println("Square is "+ eleventhTask.getSquare());

                    break;
                }
                case 3: {
                    System.out.println("Enter a and press <Enter> :");
                    double a = scan.nextDouble();
                    NineteenthTask nineteenthTask= new NineteenthTask();
                    nineteenthTask.setA(a);
                    System.out.println("Square is "+nineteenthTask.getSquare());
                    System.out.println("Height is "+nineteenthTask.getHeight());
                    System.out.println("Inscribed circle radius is "+nineteenthTask.getRadiusIn());
                    System.out.println("Radius of the circumscribed circle is "+nineteenthTask.getRadiusOut());
                    break;
                }
                case 4: {
                    System.out.println("Enter a and press <Enter>");
                    double a = scan.nextDouble();
                    TwentySeventhTask twentySeventhTask= new TwentySeventhTask();
                    twentySeventhTask.setA(a);
                    twentySeventhTask.calculate();
                    break;
                }
                case 5: {
                    System.out.println("Enter m and press <Enter> & number and n <Enter>:");
                    double m = scan.nextDouble();
                    double n = scan.nextDouble();
                    ThirtyFifthTask thirtyFifthTask= new ThirtyFifthTask();
                    thirtyFifthTask.setM(m);
                    thirtyFifthTask.setN(n);
                    thirtyFifthTask.calculate();
                    break;
                }
                case 6: {
                    System.out.println("Exit");
                    run = false;
                    break;
                }
                default:
                    System.out.println("You can choose only 1-6");
                    break;
            }
        }
    }



}
