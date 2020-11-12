/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan41.massajenis;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan hasil perhitungan
 * massa jenis kubus
 */

public class PBOIF210119044Latihan41MassaJenis {
    public static void main(String[] args) {
        Kubus objKubus = new Kubus();
        System.out.println("=====Massa Jenis Kubus=====");
        objKubus.setSisi(5);
        System.out.println("Sisi : "+objKubus.getSisi());
        objKubus.setMassa(250);
        System.out.println("Massa : "+objKubus.getMassa()+"\n");
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : "+objKubus.hitungVolume(objKubus.getSisi()));
        System.out.println("Massa Jenis : "+objKubus.hitungMassaJenis(objKubus.getMassa(), objKubus.hitungVolume(objKubus.getSisi())));
    }   
}
