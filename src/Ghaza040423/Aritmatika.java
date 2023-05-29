/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ghaza040423;

/**
 *
 * @author muham
 */
public class Aritmatika {
    public int tambah(int a, int b){
        return a+b;
    }
    
    public boolean cekGanjil(int a){
        return(a%2==1);
    }
    
    public int getGanjil(int angka){
      
     int data[] = new int[50];
     
     for( int i=0;i<100;i++){
       
       data[i] = i;   
     }
     for(int i=0;i<data.length;i++){
         System.out.println("angka"+data[i]);
     }
        
     return 0;
    }
 
    public static void main(String[] args){
        Aritmatika aritmatika = new Aritmatika();
        int c = aritmatika.tambah(12,7);
        System.out.println("Nilai C ="+c);
        System.out.println("Ganjil ?"+aritmatika.cekGanjil(c));
    }
}
