/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author pc20
 */
class Makanan {
    // Atribut
    String nama;
    double harga;

    // Konstruktor
    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi makanan
    public void tampilkanInfo() {
        System.out.println("Nama Makanan : " + nama);
        System.out.println("Harga        : Rp" + harga);
    }
}

