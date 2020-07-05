/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author N
 */
public class bufferedreader {
    public static void main(String[] args ) throws IOException{
    
        String nama ; 
        String mantan ;        
        int angka, nilai;
        double desimal;
        
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader (isr); 
        
        System.out. println ("opo merek hp mu ?");
        nama= br.readLine();
        
        System. out. println ("sopo jeneng e mantan mu ? ");
        mantan = br.readLine();
        
        
        System.out.println("berapa nomer hp mu");
        angka = Integer.parseInt (br.readLine());
        
        System.out.println("berapa nilai ujian ipa");
        nilai = Integer.parseInt (br.readLine());
        
        System.out.println("berapa tinggi badan mu");
        desimal=Double.parseDouble(br.readLine());
        
        System.out.println("merek hp mu iku " + nama);
        System.out.println("owala mantan mu " +mantan);
        System.out.println("nomer: " +angka);
        System.out.println("nilai ujian ipa mu .." +nilai);
        System.out.println("tingi badan mu" +desimal);
    }
}
