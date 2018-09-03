/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteg;

/**
 *
 * @author Praktikan
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        boolean ulang = true;
        do {
            
        // Menu
        System.out.println("Warteg Bikini Bottom");
        System.out.println("===========================");
        System.out.println("List Makanan");
        System.out.println("---------------------------");
        System.out.println("m001 \t Indomie Goreng (Rp3000)");
        System.out.println("m002 \t Indomie Rebus (Rp3500)");
        System.out.println("m003 \t Nasi Goreng (Rp12000)");
        System.out.println("m004 \t Nasi Uduk (Rp6000)");
        System.out.println("m005 \t Nasi Kuning(Rp6000)");
        
        System.out.println();
        
        System.out.println("List Minuman");
        System.out.println("---------------------------");
        System.out.println("n001 \t Jus Alpukat (Rp6000)");
        System.out.println("n002 \t Es Susu Coklat (Rp5000)");
        System.out.println("n003 \t Es Kelapa Muda (Rp5000)");
        System.out.println("n004 \t Es Cendol (Rp3000)");
        System.out.println("n005 \t Jus Jeruk (Rp3000)");
        System.out.println("===========================");
        
        Scanner in = new Scanner(System.in);
        
        // Data diri
        System.out.print("Nama \t\t : ");
        String nama = in.nextLine();
        System.out.print("Jenis Kelamin \t : ");
        String jenisKelamin = in.nextLine().toUpperCase();
        System.out.print("Umur \t\t : ");
        int umur = in.nextInt();
        
        in.nextLine();
        
        // Data pesanan
        System.out.print("Kode Makanan \t : ");
        String kodeMakanan = in.nextLine();
        System.out.print("Jumlah \t\t : ");
        int jumlahMakanan = in.nextInt();
        
        in.nextLine();
        
        System.out.print("Kode Minuman \t : ");
        String kodeMinuman = in.nextLine();
        System.out.print("Jumlah \t\t : ");
        int jumlahMinuman = in.nextInt();
        
        // Menentukan harga berdasarkan kode makanan dan minuman
        String namaMakanan = "";
        float hargaMakanan = 0f;
        switch (kodeMakanan) {
            case "m001":
                namaMakanan = "Mie Goreng";
                hargaMakanan = 3000;
                break;
            case "m002":
                namaMakanan = "Mie Rebus";
                hargaMakanan = 3500;
                break;
            case "m003":
                namaMakanan = "Nas Goreng";
                hargaMakanan = 12000;
                break;
            case "m004":
                namaMakanan = "Nasi Uduk";
                hargaMakanan = 6000;
                break;
            case "m005":
                namaMakanan = "Nasi Kuning";
                hargaMakanan = 6000;
                break;
        }
        
        String namaMinuman = "";
        float hargaMinuman = 0f;
        switch (kodeMinuman) {
            case "n001":
                namaMinuman = "Jus Alpukat";
                hargaMinuman = 6000;
                break;
            case "n002":
                namaMinuman = "Es Susu Coklat";
                hargaMinuman = 5000;
                break;
            case "n003":
                namaMinuman = "Es Kelapa Muda";
                hargaMinuman = 5000;
                break;
            case "n004":
                namaMinuman = "Es Cendol";
                hargaMinuman = 3000;
                break;
            case "n005":
                namaMinuman = "Jus Jeruk";
                hargaMinuman = 3000;
                break;
        }
        
        // Buat objek makanan dan minuman
        Makanan makanan = new Makanan();
        makanan.setKodeMakanan(kodeMakanan);
        makanan.setNama(namaMakanan);
        makanan.setHarga(hargaMakanan);
        
        Minuman minuman = new Minuman(kodeMinuman, namaMinuman, hargaMinuman);
        
        // Buat objek pesanan
        Pesanan pesanan = new Pesanan();
        pesanan.setFood(makanan);
        pesanan.setDrink(minuman);
        
        // Buat objek manusia
        Manusia hero = new Manusia();
        hero.setNama(nama);
        hero.setJenisKelamin(jenisKelamin);
        hero.setUmur(umur);
        hero.setPesanan(pesanan);
        
        hero.tampilPesanan(jumlahMakanan, jumlahMinuman);
        
        in.nextLine();
        
        System.out.print("Ingin memesan lagi? (Y/selain Y): ");
        String jawaban = in.nextLine().toUpperCase();
        
        
        ulang = jawaban.equals("Y");
        
        } while (ulang);
        
    }
    
}
