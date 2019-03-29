package com.AreaOfCircle;

public class AreaOfCircle {
    private double radius;
    private double area;
    public AreaOfCircle(){

    }

    public AreaOfCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculate(){
        return area=3.14*(radius*radius*radius);
    }
}
