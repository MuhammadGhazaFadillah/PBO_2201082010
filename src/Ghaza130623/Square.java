/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ghaza130623;

/**
 *
 * @author muham
 */
public class Square extends Shape {
    private int s;
    private double area;
    
    public void setS(int s){
        this.s = s;
    }
    
    public int getS(){
        return s;
    }
    
    public String getName(){
        return "Lingkaran";
    }
    
    public double getArea(){
        area = s * s;
        return area;
    }
}
