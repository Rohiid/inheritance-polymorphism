/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.poly.sederhana;

/**
 *
 * @author victu
 */
//Class Buku
public class Buku extends Produk implements Pembayaran {
    public Buku(int harga, int jumlah) {
        super(harga, jumlah);
    }
    
    @Override
    public int hitungHargaTotal() {
        return harga * jumlah - hitungDiskon();
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Proses pembayaran buku...");
    }
    
    //implementasi method hitungDiskon
    public int hitungDiskon() {
        //diskon 20% jika harga per item > 100000
        if (harga > 100000) {
            return harga * jumlah / 5;
        } else {
            return harga * jumlah / 10;
        }
    }
}
