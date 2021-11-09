package com.aamnanazawan;

import java.text.DecimalFormat;

public class Trapezoid extends Quadrilateral{
    private double height;
    private int sum;
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        super(x1,y1,x2,y2,x3,y3,x4,y4);
        height=Math.sqrt(Math.pow((getP4().getX()-getP1().getX()),2)
                +Math.pow((getP2().getY()-getP1().getY()),2));
    }
    public double area(){
        return (sum/2)*height;
    }
    public String toString() {
        DecimalFormat df=new DecimalFormat("0");
        return "\ncoordinates of Trapezoid are:\n" +
                super.toString()
       + "\nheight is:" +df.format(height)
                +"\nArea is :"+ df.format(area());
    }
}
