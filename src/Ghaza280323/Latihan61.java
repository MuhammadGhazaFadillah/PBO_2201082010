/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ghaza280323;

/**
 *
 * @author muham
 */
import javax.swing.JOptionPane;

public class Latihan61 {
    public static void main(String[] args) {
     
        String input1 = JOptionPane.showInputDialog("Masukan nilai 1 ");
        int nilai1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog("Masukan nilai 2 ");
        int nilai2 = Integer.parseInt(input2);
        
        String input3 = JOptionPane.showInputDialog("Masukan nilai 3 ");
        int nilai3 = Integer.parseInt(input3);
        
        int rata = (nilai1 + nilai2 + nilai3)/3;
        
        String output = "rata rata dari nilai : "+rata+"\n";
        
        if(rata >= 60){
          output  += ":)";
        }else{
          output  += ":(";
        }
        
        JOptionPane.showMessageDialog(null, output);
        
    }
}
