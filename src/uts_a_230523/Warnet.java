/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_a_230523;

import java.time.LocalTime;


/**
 *
 * @author muham
 */
public class Warnet {
    private String kdlgn;
    private String nmlgn;
    private String jenisP;
    private double jam_masuk;
    private double jam_keluar;
    private double lama;
    private double tarif;
    private double total;
    
    
    public String getKode(){
        return kdlgn;
    }
    public void setKode(String kdlgn){
        this.kdlgn = kdlgn;
    }
    
    public String getNama(){
        return nmlgn;
    }
    public void setNama(String nmlgn){
        this.nmlgn = nmlgn;
    }
    
    public String getJenis(){
        switch (jenisP){
            case "VIP" -> tarif = 10000;
            case "Umum" -> tarif = 15000;
            default -> System.out.println("Maaf Jenis yang anda pilih tidak tersedia");
        }
        return jenisP;
    }
    public void setJenis(String jenisP){
        this.jenisP = jenisP;
    }
    
    public double getJamK(){
        return jam_keluar;
    }
    public void setJamK(double jam_keluar){
        this.jam_keluar = jam_keluar;
    }
    
    public double getJamM(){
        return jam_masuk;
    }
    public void setJamM(double jam_masuk){
        this.jam_masuk = jam_masuk;
    }
    
    public double getLama(){
        lama = jam_keluar - jam_masuk;
        return lama;
    }
    public void setLama(double lama){
        this.lama = lama;
    }
    
    public double getTarif(){
        return tarif;
    }
    public void setTarif(double tarif){
        this.tarif = tarif;
    }
    
    public double getTotal(){
        total = lama * tarif;
        return total;
    }
    
}
