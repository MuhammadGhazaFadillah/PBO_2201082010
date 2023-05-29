/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ghaza110423;

/**
 *
 * @author muham
 */
public class Latihan82 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Java ArithmeticOperation <number1> <number2>");
            return;
        }
        int angka1 = Integer.parseInt(args[0]);
        int angka2 = Integer.parseInt(args[1]);
        int sum = angka1 + angka2;
        int difference = angka1 - angka2;
        int product = angka1 * angka2;
        int quotient = angka1 / angka2;
        System.out.println("Penjumlahan = " + sum);
        System.out.println("Pengurangan = " + difference);
        System.out.println("Perkalian   = " + product);
        System.out.println("Pembagian   = " + quotient);
    }
}
