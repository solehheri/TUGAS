/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSnomer3;

import java.util.Scanner;
        
/**
 *
 * @author N
 */
public class UTSnomer3 {
    
    public static void main(String[] args) {
        
        // percabangan
        System.out.println("beli seragam sekolah");
        System.out.println("coba seragam sekolah");
        System.out.println("apakah ingin nambah dasi? (true/false)");
        Scanner s = new Scanner (System.in);
        boolean dasi = s.nextBoolean();
        if (dasi == true){
            System.out.println("tambah dasi");
            System.out.println("pilh dasi");
           
        } 
        System.out.println("bayar di kasir");
        System.out.println("bawa pulang");
    
        //perulangan
        for (int i=0; i <= 15; i++){
            System.out.println("sampai jumpa lagi :v" );
        
            
            
        //input output
            System.out.println(" inputoutput : beli seragam sekolah");
            Scanner br = new Scanner(System.in);
                    String beliseragamsekolah = br.nextLine();
        
    
        }
    }
}