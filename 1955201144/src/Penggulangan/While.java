/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penggulangan;

import java.util.Scanner;

/**
 *
 * @author N
 */
public class While {
 public static void main(String[] args) {
        // membuAT variabel dan scanner
        boolean berjalan= true;
        int penghitung =0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while(berjalan){
            System.out.println("koen nyolong ta gak?");
            System.out.println("Jawab  [Yo/TagAK]");
        jawab = scan.nextLine();
        
        // CEK JAWABANNYA KALAU YA BERHENTI MENGULANG
        if(jawab.equalsIgnoreCase("yo")){
            berjalan = false;}
        penghitung++;
        }
        System.out.println("koen wes tau nyolong peng piro "+penghitung+" kali");
    }
}    

