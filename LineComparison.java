package com.line_comparison;

import javax.sound.sampled.Line;
import java.awt.*;
import java.util.Scanner;

public class LineComparison {

    private static Point inputPoint(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        return new Point(x,y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to line comparison problem..");

        // finding distance between two points
        System.out.println("Enter two points:-");
        Point p1 = inputPoint();
        Point p2 = inputPoint();
        System.out.println("Distance between (x1,y1) and (x2,y2): "
                + distanceBetweenTwoPoints(p1,p2));

        // checking if two lines are equal
        System.out.println("Enter two Lines each with two points:-");
        Point p3 = inputPoint();
        Point p4 = inputPoint();
        Point p5 = inputPoint();
        Point p6 = inputPoint();

        if(isSameLine(p3,p4,p5,p6)){
            System.out.println("Both lines length are equal.");
        }else{
            System.out.println("Both lines length are not equal.");
        }
    }

    /*
    Distance between two points
    @params: x1,y1,x2,y2
    @return: double
     */
    public static double distanceBetweenTwoPoints(Point p1,Point p2){
        int x = (p1.x-p2.x)*(p1.x-p2.x);
        int y = (p1.y-p2.y)*(p1.y-p2.y);
        return Math.sqrt(x+y);
    }
    /*
    Check if both lines length are same
    @params:p1,p2,p3,p4 (end points of two lines)
    @return: true if both lines length are same
     */
    public static boolean isSameLine(Point p1,Point p2,Point p3,Point p4){
        double length1 = distanceBetweenTwoPoints(p1,p2);
        double length2 = distanceBetweenTwoPoints(p3,p4);
        return length2 == length1;
    }
}
