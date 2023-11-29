package com.line_comparison;

import java.util.Scanner;

public class LineComparison {

    private static Point inputPoint(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y of the point: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        return new Point(x,y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to line comparison problem..");

        while(true){
            System.out.println("Enter 1 to find distance between two points.");
            System.out.println("Enter 2 to check if length of two lines are equal.");
            System.out.println("Enter 3 to compare length of two lines.");
            System.out.println("Enter 4 to exit the program.");

            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    // finding distance between two points
                    System.out.println("Enter two points:-");
                    Point p1 = inputPoint();
                    Point p2 = inputPoint();
                    System.out.println("Distance between (x1,y1) and (x2,y2): "
                            + p1.distanceBetweenPoints(p2));
                    break;

                case 2:
                    // checking if two lines are equal
                    System.out.println("Enter two Lines each with two points:-");
                    Line A = new Line(inputPoint(),inputPoint());
                    Line B = new Line(inputPoint(),inputPoint());

                    if(A.isSameLine(B)){
                        System.out.println("Both lines length are equal.");
                    }else{
                        System.out.println("Both lines length are not equal.");
                    }
                    break;

                case 3:
                    //check if length of one line is greater,equal or lesser
                    System.out.println("Enter two Lines each with two points:-");
                    Line C = new Line(inputPoint(),inputPoint());
                    Line D = new Line(inputPoint(),inputPoint());

                    if(C.lengthCompare(D) == 0){
                        System.out.println("Both have same length.");
                    }else if(C.lengthCompare(D) > 0){
                        System.out.println("Line one has greater length than line two.");
                    }else{
                        System.out.println("Line one has smaller length than line two.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    return;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
