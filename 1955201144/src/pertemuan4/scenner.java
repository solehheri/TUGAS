/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author N
 */
import java.util.Scanner;

 public class scenner {
 
     public static void main(String[] args) {
        
        String nama, alamat;
        int tangal = 0;
        double berat, tinggi;
                 
        System.out.println("opo jeneng e peda mu ?");
        Scanner inputUser = new Scanner(System.in);
        nama = (inputUser.nextLine());
        
        System.out.println("Dimana alamat anda ?");
        alamat = inputUser.nextLine();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("dino opo koen lahir ?");
        String tanggal = scan.nextLine();
        
        System.out.println("Berapa berat badan anda ?");
        Scanner input = new Scanner(System.in);
        berat = (scan.nextDouble());
        
        System.out.println("Berapa tinggi badan anda ?");
        tinggi = input.nextDouble();
        
        System.out.println("Nama :  " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Tanggal lahir : " + tanggal);
        System.out.println("Berat badan : " + berat);
        System.out.println("Tinggi badan : " + tinggi);
        System.out.println("   udah ,gitu aja  ;)");
    }
}   

