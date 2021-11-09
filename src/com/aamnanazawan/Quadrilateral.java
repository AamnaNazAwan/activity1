package com.aamnanazawan;
public class Quadrilateral {
private point p1;
    private point p2;
    private point p3;
    private point p4;

    public point getP1() {
        return p1;
    }

    public void setP1(point p1) {
        this.p1 = p1;
    }

    public point getP2() {
        return p2;
    }

    public void setP2(point p2) {
        this.p2 = p2;
    }

    public point getP3() {
        return p3;
    }

    public void setP3(point p3) {
        this.p3 = p3;
    }

    public point getP4() {
        return p4;
    }

    public void setP4(point p4) {
        this.p4 = p4;
    }

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        this.p1 = new point(x1,y1);
        this.p2 = new point(x2,y2);
        this.p3 = new point(x3,y3);
        this.p4 = new point(x4,y4);

    }

    @Override
    public String toString() {
        return p1+","+p2+","+p3+","+p4;
    }
}
