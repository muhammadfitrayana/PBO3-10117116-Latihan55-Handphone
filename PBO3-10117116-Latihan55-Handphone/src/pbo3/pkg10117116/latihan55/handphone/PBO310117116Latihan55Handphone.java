/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan55.handphone;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Data Spesifikasi handphone
 *  
 */
public class PBO310117116Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    protected static String manufacture;
    protected static String operatingSystem;
    protected static String model;
    protected static int harga;
    
    public static void main(String[] args) {
    
    Handphone handphone = new Handphone(manufacture, operatingSystem, model, harga);
    handphone.displayProduct();
    }
    
}
