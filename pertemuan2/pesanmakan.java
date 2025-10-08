/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author pc20
 */
public class pesanmakan {
    // Kelas utama
    public static void main(String[] args) {
        // Membuat objek makanan
        Makanan makanan1 = new Makanan("Nasi Goreng", 20000);
        Makanan makanan2 = new Makanan("Mie Ayam", 15000);

        // Menampilkan informasi makanan
        System.out.println("=== PESANAN MAKANAN ===\n");

        makanan1.tampilkanInfo();
        System.out.println(); // Spasi antar item
        makanan2.tampilkanInfo();

        // Menghitung total harga
        double totalHarga = makanan1.harga + makanan2.harga;
        System.out.println("\nTotal Harga : Rp" + totalHarga);
    }
}


