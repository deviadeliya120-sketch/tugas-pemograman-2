/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_dua;

import java.util.Scanner;

/**
 *
 * @author pc20
 */
public class CLASS {
      public static void main(String[] args) {
          // Meminta pengguna untuk memasukkan jumlah angka yang akan diinputkan
          try ( // Membuat scanner untuk menerima input dari pengguna
                  Scanner scanner = new Scanner(System.in)) {
              // Meminta pengguna untuk memasukkan jumlah angka yang akan diinputkan
              System.out.print("Masukkan jumlah elemen: ");
              int jumlahElemen = scanner.nextInt();
              // Membuat array untuk menyimpan angka
              int[] angka = new int[jumlahElemen];
              // Menggunakan perulangan untuk menerima input angka dari pengguna
              for (int i = 0; i < jumlahElemen; i++) {
                  System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                  angka[i] = scanner.nextInt();
              }     // Inisialisasi nilai terbesar dan terkecil
              int nilaiTerbesar = angka[0];
              int nilaiTerkecil = angka[0];
              // Menggunakan perulangan untuk mencari nilai terbesar dan terkecil
              for (int i = 1; i < jumlahElemen; i++) {
                  if (angka[i] > nilaiTerbesar) {
                      nilaiTerbesar = angka[i];
                  }
                  if (angka[i] < nilaiTerkecil) {
                      nilaiTerkecil = angka[i];
                  }
              }     // Menampilkan hasil
              System.out.println("Nilai terbesar: " + nilaiTerbesar);
              System.out.println("Nilai terkecil: " + nilaiTerkecil);
              // Menutup scanner
          }
    } 
      }
