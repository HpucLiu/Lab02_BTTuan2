package Bai01;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Bai01 {
    public static void main(String[] args) {
        Retangle r1=new Retangle();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        double Length = sc.nextDouble();
        System.out.print("Width: ");
        double Width = sc.nextDouble();
        Retangle r2=new Retangle(Length, Width);
        
        System.out.println(r1);
        System.out.println(r2);
        
    }
}
