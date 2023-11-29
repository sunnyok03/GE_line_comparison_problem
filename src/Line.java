package com.line_comparison;

/*
   @desc: Line class with two points
 */
public class Line {
    Point a;
    Point b;

    Line(Point a,Point b){
        this.a = a;
        this.b = b;
    }

    /*
    @desc:to find length of a line
    @params:
    @return: double (distance between two points)
     */
    public double lineLength(){
        Point a = this.a;
        Point b = this.b;
       return a.distanceBetweenPoints(b);
    }

    /*
    Check if both lines length are equal
    @params:b (line)
    @return: true if both lines length are equal
    */
    public boolean isSameLine(Line b){
        return this.lineLength() == b.lineLength();
    }

    /*
    Check if one line length is equal, greater or less than other
    @params: p1,p2,p3,p4 (end points of two lines)
    @return: Integer value (0 if equal, <0 if first is smaller or >0 if first is greater)
     */
    public int lengthCompare(Line B){
        Point x1 = this.a;
        Point y1 = this.b;
        Point x2 = B.a;
        Point y2 = B.b;
        double length1 = x1.distanceBetweenPoints(y1);
        double length2 = x2.distanceBetweenPoints(y2);
        return String.valueOf(length1).compareTo(String.valueOf(length2));
    }
}
