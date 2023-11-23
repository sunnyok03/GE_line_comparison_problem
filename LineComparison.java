package com.line_comparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to line comparison problem..");

        // finding distance between two points
        System.out.print("Enter x1,y1 and x2,y2: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Distance between (x1,y1) and (x2,y2): "
                + distanceBetweenTwoPoints(x1,y1,x2,y2));


    }

    /*
    Distance between two points
    @params: x1,y1,x2,y2
    @return: double
     */
    public static double distanceBetweenTwoPoints(int x1,int y1,int x2,int y2){
        int x = (x1-x2)*(x1-x2);
        int y = (y1-y2)*(y1-y2);
        return Math.sqrt(x+y);
    }
}
