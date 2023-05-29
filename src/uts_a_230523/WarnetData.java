/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_a_230523;

/**
 *
 * @author muham
 */
public class WarnetData {
    private Warnet data[] = new Warnet[100];
    private int index;
    
    public void insert(Warnet warnet){
        data[index] = warnet;
        index++;
    }
    
    public void update(int index, Warnet warnet){
        data[index] = warnet;
    }
    
    public void delete(int index){
        data[index] = null;
    }
    public Warnet[] getData(){
        return data;
    }
    
    public static void main(String [] args){
        WarnetData data = new WarnetData();
        
        Warnet data1 = new Warnet();
        data1.setKode("001");
        data1.setNama("Ghaza");
        data1.setJenis("VIP");
        data1.setJamK(12.30);
        data1.setJamM(10.30);
        data.insert(data1);
        //data.update();
        //data.delete(0);
        
        Warnet[] temp = data.getData();
        for(int i=0; i<temp.length;i++){
            if(temp[i]!=null){
            System.out.println("Data ke          -->"+ (i+1));
            System.out.println("Kode Pelanggan      "+ temp[i].getKode());
            System.out.println("Nama Pelanggan      "+ temp[i].getNama());
            System.out.println("Jenis Pelanggan     "+ temp[i].getJenis());
            System.out.println("Jam Masuk           "+ temp[i].getJamM());
            System.out.println("Jam Keluar          "+ temp[i].getJamK());
            System.out.println("Lama Pelanggan      "+ temp[i].getLama());
            System.out.println("Tarif Per Jam       "+ temp[i].getTarif());
            System.out.println("Total Pembayaran    "+ temp[i].getTotal());
            }
    
        }
    }
}
