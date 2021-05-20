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
        boolean bool = true;
        while (bool) {
            showMenu();
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    logger.info("User chose Task 3");
                    System.out.println("Enter x and press <Enter> & y and press <Enter>:");
                    double x = scan.nextDouble();
                    double y = scan.nextDouble();
                    System.out.println("x=" + x+" y="+y);
                    ThirdTask thirdTask= new ThirdTask();
                    thirdTask.setX(x);
                    thirdTask.setY(y);
                    System.out.println("Z = " + thirdTask.calculate());
                    logger.info("Task completed successfully");
                    break;
                }
                case 2: {
                    logger.info("User chose Task 11");
                    System.out.println("Enter a and press <Enter> & number and b <Enter>:");
                    double a = scan.nextDouble();
                    double b = scan.nextDouble();
                    EleventhTask eleventhTask = new EleventhTask();
                    eleventhTask.setA(a);
                    eleventhTask.setB(b);
                    double p=eleventhTask.getPerimeter();
                    if (p!=0){
                    System.out.println("Perimeter is " + p);
                    logger.info("Function completed successfully");
                    }
                    double s=eleventhTask.getSquare();
                    if (s!=0) {
                        System.out.println("Square is " +s );
                        logger.info("Function completed successfully");
                    }

                    break;
                }
                case 3: {
                    logger.info("User chose Task 19");
                    System.out.println("Enter a and press <Enter> :");
                    double a = scan.nextDouble();
                    NineteenthTask nineteenthTask= new NineteenthTask();
                    nineteenthTask.setA(a);
                    double s=nineteenthTask.getSquare();
                    if(s!=0) {
                        System.out.println("Square is " + s);
                        logger.info("Function completed successfully");
                    }
                    double height=nineteenthTask.getHeight();
                    if(height!=0){
                        System.out.println("Height is "+height);
                        logger.info("Function completed successfully");
                    }
                    double rIn=nineteenthTask.getRadiusIn();
                    if(rIn!=0) {
                        System.out.println("Inscribed circle radius is " + rIn);
                        logger.info("Function completed successfully");
                    }
                    double rOut=nineteenthTask.getRadiusOut();
                    if(rOut!=0);
                    {
                        System.out.println("Radius of the circumscribed circle is " + rOut);
                        logger.info("Function completed successfully");
                    }
                    break;
                }
                case 4: {
                    logger.info("User chose Task 27");
                    System.out.println("Enter a and press <Enter>");
                    double a = scan.nextDouble();
                    TwentySeventhTask twentySeventhTask= new TwentySeventhTask();
                    twentySeventhTask.setA(a);
                    twentySeventhTask.calculate();
                    logger.info("Task completed successfully");
                    break;
                }
                case 5: {
                    logger.info("User chose Task 35");
                    System.out.println("Enter m and press <Enter> & number and n <Enter>:");
                    double m = scan.nextDouble();
                    double n = scan.nextDouble();
                    ThirtyFifthTask thirtyFifthTask= new ThirtyFifthTask();
                    thirtyFifthTask.setM(m);
                    thirtyFifthTask.setN(n);
                    thirtyFifthTask.calculate();
                    logger.info("Task completed successfully");
                    break;
                }
                case 6: {
                    logger.info("Exit");
                    bool = false;
                    break;
                }
                default:
                    logger.error("You can choose only 1-6");
                    break;
            }
        }
    }



}
