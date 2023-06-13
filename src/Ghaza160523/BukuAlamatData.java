/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ghaza160523;

/**
 *
 * @author muham
 */
public class BukuAlamatData {
    private BukuAlamat data[] = new BukuAlamat[100];
    private int index;
    
    public void insert(BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
        index++;
    }
    
    public void update(int index, BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
    }
    
    public void delete(int index){
        data[index] = null;
    }
    public BukuAlamat[] getData(){
        return data;
    }
    
    public static void main(String[] args){
        BukuAlamatData data = new BukuAlamatData();
        
        BukuAlamat data1 = new BukuAlamat();
        data1.setNama("Ali");
        data1.setAlamat("Padang");
        data1.setNoTelp("089601617563");
        data1.setEmail("muhammadali@gmail.com");
        data.insert(data1);
        
        BukuAlamat data2 = new BukuAlamat();
        data2.setNama("Muhammad Ghaza Fadillah");
        data2.setAlamat("Padang");
        data2.setNoTelp("089601617562");
        data2.setEmail("muhammadghaza@gmail.com");
        data.insert(data2);
        
        BukuAlamat[] temp = data.getData();
        for(int i=0; i<temp.length;i++){
            if(temp[i]!=null){
            System.out.println("Data ke -->"+ (i+1));
            System.out.println("Nama       "+ temp[i].getNama());
            System.out.println("Alamat     "+ temp[i].getAlamat());
            System.out.println("NoTelp     "+ temp[i].getNoTelp());
            System.out.println("Email      "+ temp[i].getEmail());
            }
    
        }
    }
}
