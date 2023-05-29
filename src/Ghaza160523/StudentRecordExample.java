/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ghaza160523;

/**
 *
 * @author muham
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord anna = new StudentRecord();
        anna.setName("Anna");
        anna.setAddress("padang");
        anna.setAge(18);
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
        ////
        StudentRecord ali = new StudentRecord();
        ali.setName("Ali");
        ali.setAddress("Padang");
        ali.print("");
        ali.print(80,70,90);
        
        StudentRecord budi = new StudentRecord("Budi","Padang");
        budi.print("");
        budi.print(80,70,90);
        
        System.out.println("Jumlah Siswa :"+StudentRecord.getStudentCount());
        
    } 
}
