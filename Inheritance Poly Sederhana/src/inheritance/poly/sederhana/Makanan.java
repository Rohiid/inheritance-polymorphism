/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.poly.sederhana;

/**
 *
 * @author victu
 */
//Class Makanan
public class Makanan extends Produk implements Pembayaran {
    public Makanan(int harga, int jumlah) {
        super(harga, jumlah);
    }
    
    @Override
    public int hitungHargaTotal() {
        return harga * jumlah - hitungDiskon();
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Proses pembayaran makanan...");
    }
    
    //implementasi method hitungDiskon
    public int hitungDiskon() {
        //diskon 5% jika jumlah > 10
        if (jumlah > 10) {
            return harga * jumlah / 20;
        } else {
            return 0;
        }
    }
}
