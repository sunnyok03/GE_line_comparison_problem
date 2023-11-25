package com.line_comparison;


/*
@desc:Point class with x value and y value
 */
public class Point {
    double x;
    double y;

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    /*
   @desc:Distance between two points
   @params: x1,y1 (called on object so this pointer will give another Point)
   @return: double
    */
    public double distanceBetweenPoints(Point b){
        Point a = this;
        double X = (a.x-b.x)*(a.x-b.x);
        double Y = (a.y-b.y)*(a.y-b.y);
        return Math.sqrt(X+Y);
    }
}
