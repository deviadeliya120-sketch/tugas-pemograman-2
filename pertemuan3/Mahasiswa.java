/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author pc20
 */
public class Mahasiswa {
    
    String nama = " ";
    String Nim =" ";
    double Ipk = 0;
    String predikat = " ";
    
    //konstruktor metode khusus yang dipanggil secara otomatis 
    public Mahasiswa( String nama ,String Nim , String prodi , double Ipk){
        this.nama = nama;
        this.Nim = Nim ;
        this.Ipk = Ipk;
       
        
    }
    //Method untuk menampilkan data siswa
    public void tampilkanData(){
     System.out.println("Nama: " + nama);
     System.out.println("Nim : " + Nim);
     System.out.println("IPk : "+ Ipk);
    }
    String predikat(){
        if(Ipk >=3.50){
            predikat=" Cumlaud";
        }else if (Ipk >= 3.25){
            predikat =" sanggat memuaskan";
      }else if (Ipk >= 2.5){
          predikat = " memuaskan";
      }
      System.out.println("predikat :"+ predikat);
      return predikat;
    }
    
       
    }
    



