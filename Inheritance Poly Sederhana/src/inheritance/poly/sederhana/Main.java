/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance.poly.sederhana;

/**
 *
 * @author victu
 */
//Class Main
public class Main {
    public static void main(String[] args) {
        //Membuat objek produk
        Buku buku = new Buku(50000, 2);
        Pakaian pakaian = new Pakaian(152340000, 3);
        Makanan makanan = new Makanan(10000, 15);
        //Menghitung harga total produk dan menampilkan informasi pembayaran
        System.out.println("Total harga buku: " + buku.hitungHargaTotal());
        buku.prosesPembayaran();
        
        System.out.println("Total harga pakaian: " + pakaian.hitungHargaTotal());
        pakaian.prosesPembayaran();
        
        System.out.println("Total harga makanan: " + makanan.hitungHargaTotal());
        makanan.prosesPembayaran();
    }
}
