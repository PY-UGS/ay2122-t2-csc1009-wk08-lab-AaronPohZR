package CSC1009.wk08_lab;

import java.util.Scanner;

public class Week08 {

    public void wk08_question1(){
        double radius;

        boolean valid = false;
        Scanner input = new Scanner(System.in);

        while(valid == false){
            valid=true;
            try{
                System.out.print("Enter the radius of the circle :");
                radius = input.nextDouble();
                CircleWithException circle = new CircleWithException(radius);
                System.out.println("The radius is " + circle.getRadius());
                System.out.println("The area is " + circle.getArea());
                System.out.println("The diameter is " + circle.getDiameter());
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                valid = false;
            }
            catch(Exception d){
                System.out.println(d.getMessage());
                valid = false;
            }
        }
    }
    public void wk08_question2(){
        BankDemoTest testing = new BankDemoTest();
    }
}   


