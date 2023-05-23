/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author C-1
 */
public class Uts {

    /**
     * @param args the command line arguments   
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    
    String[] names = {"John", "Emily", "Michael", "Sophia", "William"};
    
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
    
    String[] biodata = {"Nama : Afif Bayu putra awaldi", "Nim : 18201128", "Alamat : Jl.MT Haryono 6, 868 Kota Malang", "Umur : 23 Tahun", "Tinggi : 165 cm"};
    
    for (int i = 0; i < biodata.length; i++) {
      System.out.println(biodata[i]);
    }
    }
}
