/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percabangan;

import java.util.Scanner;

/**
 *
 * @author N
 */
public class IfElse {
 public static void main(String[] args) {
        // variabel
        int pemenanglomba;
        String nama;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nama: ");
        nama = scan.nextLine();
        System.out.println("Pemenang lomba puisi: ");
        pemenanglomba = scan.nextInt();
        
        if(pemenanglomba <=1) {
            System.out.println(nama+" SELAMAT, kamu mendapat uwang tunai,"
                    + " minta ke ibu mu ya !!");
        }else{
            System.out.println(nama+" cobala di lain waktu");}
    }
}   

