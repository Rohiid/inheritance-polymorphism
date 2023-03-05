/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.poly.sederhana;

/**
 *
 * @author victu
 */
//Class Pakaian
public class Pakaian extends Produk implements Pembayaran {
    public Pakaian(int harga, int jumlah) {
        super(harga, jumlah);
    }
    
    @Override
    public int hitungHargaTotal() {
        return harga * jumlah - hitungDiskon();
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Proses pembayaran pakaian...");
    }
    
    //implementasi method hitungDiskon
    public int hitungDiskon() {
        //diskon 10% jika jumlah > 5
        if (jumlah > 5) {
            return harga * jumlah / 10;
        } else {
            return 0;
        }
    }
}
