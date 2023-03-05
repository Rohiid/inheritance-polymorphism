/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.poly.sederhana;

/**
 *
 * @author victu
 */
    //Interface Pembayaran
public interface Pembayaran {
    void prosesPembayaran();
}

//Abstract class Produk
public abstract class Produk {
    protected int harga;
    protected int jumlah;
    
    public Produk(int harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public abstract int hitungHargaTotal();
}

