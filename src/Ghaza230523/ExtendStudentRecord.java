/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ghaza230523;

/**
 *
 * @author muham
 */
public class ExtendStudentRecord extends StudentRecord {

    public ExtendStudentRecord(){
        System.out.println("Student: getName");
    }    
    
    public static void main(String[] args){
        ExtendStudentRecord ali = new ExtendStudentRecord();
        StudentRecord anna = new StudentRecord();
        anna.setName("Muhammad Ghaza Fadillah");
        anna.setAddress("Jl.Rawang Ketaping No.21");
        anna.setAge(19);
        anna.setMathGrade(80);
        anna.setEnglishGrade(70);
        anna.setscienceGrade(80);
        ////
        System.out.println("Nama              :"+anna.getName());
        System.out.println("Alamat            :"+anna.getAddress());
        System.out.println("Umur              :"+anna.getAge());
        System.out.println("matematika        :"+anna.getMathGrade());
        System.out.println("B inggris         :"+anna.getEnglishGrade());
        System.out.println("Pengetahuan       :"+anna.getScienceGrade());
        System.out.println("rata rata         :"+anna.getAverage());
    }
    
}
