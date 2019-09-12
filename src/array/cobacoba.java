/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author santuy
 */
public class cobacoba {
    public static void main(String[] args) {
        int nilai [];
        System.out.println("====program rata rata====");
        nilai = new int [5];
        nilai [0] = 50;
        nilai [1] = 60;
        nilai [2] = 40;
        nilai [3] = 50;
        nilai [4] = 30;
        
        double ratarata = 0.0; 
        for (int i = 0; i <nilai.length;i++)ratarata +=nilai [i];
        ratarata/=nilai.length;
        System.out.println("nilai diatas 50 = kategori tinggi ");
        System.out.println("nilai dibawah 50 = kategori rendah ");
        System.out.println("Rata rata: "+ ratarata);
        
        if (ratarata <= 50 ) {
            System.out.println(" anda termasuk kedalam kategori rendah");
            System.out.println(" mohon tingkatkan belajar anda ");
        }else if (ratarata <=100) {
            System.out.println("anda termasuk kategori tinggi atau memenuhi syarat");
            System.out.println("PERFECT");
        }
        
    }
}
