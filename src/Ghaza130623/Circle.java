/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ghaza130623;

/**
 *
 * @author muham
 */
public class Circle extends Shape{
    private int r;
    private double phi = 3.14;
    private double area;
    
    public void setR(int r){
        this.r = r;
    }
    
    public int getR(){
        return r;
    }
    
    public String getName(){
        return "Lingkaran";
    }
    
    public double getArea(){
        area = phi * r *r;
        return area;
    }
}
