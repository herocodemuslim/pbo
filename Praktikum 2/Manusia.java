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
public class Manusia {
 
    private String nama;
    private String jenisKelamin;
    private int umur;
    private Pesanan pesanan;
    
    // Constructor
    public Manusia() {
        
    }
    
    public Manusia(String _nama, String _jenisKelamin, int _umur, Pesanan _pesanan) {
        nama = _nama;
        jenisKelamin = _jenisKelamin;
        umur = _umur;
        pesanan = _pesanan;
    }
    
    // Method setter dan getter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public Pesanan getPesanan() {
        return pesanan;
    }

    public void setPesanan(Pesanan pesanan) {
        this.pesanan = pesanan;
    }
    
    // Fungsi Menentukan panggilan 
    public String getPanggilan() {
        String panggilan = "";
        
        // 1-15 && P/L = adek
        // 16-30 && L = mas
        // 16-30 && P = mba
        // 31-50 && L = bapak
        // 31-50 && P = ibu
        // > 50 && L = kakek
        // > 50 && P = nenek
        
        // Lakukan pengechekan berdasarkan umur dan jenis kelamin
        if ( (umur >= 1 && umur <= 15) && jenisKelamin.equals("P") || jenisKelamin.equals("L") ) {
           panggilan = "Adek"; 
        } else if ( umur <= 30 && jenisKelamin.equals("L") ) {
            panggilan = "Mas";
        } else if ( umur <= 30 && jenisKelamin.equals("P") ) {
            panggilan = "Mba";
        } else if ( umur <= 50 && jenisKelamin.equals("L") ) {
            panggilan = "Bapak";
        } else if ( umur <= 50 && jenisKelamin.equals("P") ) {
            panggilan = "Ibu";
        } else if ( umur > 50 && jenisKelamin.equals("L") ) {
            panggilan = "Kakek";
        } else if ( umur > 50 && jenisKelamin.equals("P") ) {
            panggilan = "Nenek";
        }
        
        return panggilan;
    }
    
    // Fungsi menampilkan detail pesanan jumlah dan total harga nya
    public void tampilPesanan(int jumlahMakanan, int jumlahMinuman) {
        // Ambil harga dan kalikan dengan jumlah makanan
       
        
        String text = getPanggilan() + " " + nama;
        text += " memesan makanan " + (pesanan.getFood()).getNama() + " " + jumlahMakanan;
        text += " minuman " + (pesanan.getDrink()).getNama() + " " + jumlahMinuman;
        text += " dengan total bayar " + pesanan.getJumlahBayar(jumlahMakanan, jumlahMinuman);
        
        System.out.println(text);
    }
    
}
