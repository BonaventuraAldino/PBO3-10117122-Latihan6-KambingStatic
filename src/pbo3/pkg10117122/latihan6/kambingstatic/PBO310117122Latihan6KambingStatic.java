/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan6.kambingstatic;

/**
 *
 * @author lenovo
 * 
 * NAMA  : BONAVENTURA ALDINO SENDA SENI
 * KELAS : PBO-3
 * NIM   : 10117122
 * 
 */

public class PBO310117122Latihan6KambingStatic {

    //NAMA_KAMBING sebagai konstanta 
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                + Mamalia.jumlahKambing);
    }
}
