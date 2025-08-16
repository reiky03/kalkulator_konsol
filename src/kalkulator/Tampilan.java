/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author fayruz
 * @co-author zainudin
 */

import java.util.Scanner;

public class Tampilan {
    private Scanner sc;
    
    public Tampilan(){
        this.sc = new Scanner(System.in);
    }
    
    public String tanyaLagi(){
        System.out.println("Jika ingin berhenti ketikkan (yes), apabila ingin melanjutkan ketik secara random");
        System.out.print("Stop (yes)? ");
        return sc.next();
    }
    public void tampilkanData(Data d){
         System.out.println("Bilangan pertama: " + d.getBilangan1());
         System.out.println("Bilangan kedua: " + d.getBilangan2());
    }
    
    public String pilihanOperator(){
        System.out.println("Penjumlahan (+), Pengurangan (-), Perkalian(x), Pembagian(:), Ganti Bilangan (C)");
        System.out.print("Pilihan Anda: ");
        return sc.next();
    }
    
    public void masukkanData(Data d){
        System.out.print("Masukkan bilangan pertama: ");
        d.setBilangan1(sc.nextInt());
        System.out.print("Masukkan bilangan kedua: ");
        d.setBilangan2(sc.nextInt());
        System.out.println("-------------------------");
    }
    
    public void displayHasil(Data d){
        System.out.println("Hasilnya adalah: " +d.getHasil());
        System.out.println("");
    }
    
    public void displayClosing(){
        System.out.println("Terima kasih.");
    }
    
    public void displaySalahMenu(){
        System.out.println("Mohon maaf menu yang Anda pilih tidak ada.");
        System.out.println("");
    }
}
