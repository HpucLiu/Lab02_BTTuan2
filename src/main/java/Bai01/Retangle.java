package Bai01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Retangle {

    private double length;
    private double width;

    public Retangle() {
        length = 1.0;
        width = 1.0;
    }

    public Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double findArea() {
        double area;
        area = length * width;
        return area;
    }

    public double findPerimeter() {
        double perimeter;
        perimeter = (length + width) * 2;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Retangle" + "length=" + length + ", width=" + width + ", Area="+findArea()+", Perimeter="+findPerimeter();
    }


}
