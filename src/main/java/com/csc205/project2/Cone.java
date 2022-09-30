package com.csc205.project2;

public class Cone extends Shape{

    private double radius;
    private double height;

    public Cone(){
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cone(double r, double h){
        super();
        this.radius = r;
        this.height = h;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        this.height = h;

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public double surfaceArea(){
        return Math.PI*radius*(radius+Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    public double volume(){
        return Math.PI * Math.pow(radius, 2)*(height/3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
