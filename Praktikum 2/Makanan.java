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
public class Makanan {
    
    // Atribut
    private String kodeMakanan;
    private String nama;
    private double harga;
    
    // Constructor
    public Makanan() {
        
    }
    
    public Makanan (String _kodeMakanan, String _nama, float _harga) {
       kodeMakanan = _kodeMakanan;
       nama = _nama;
       harga = _harga;
    }
    
    // Method getter setter
    public String getKodeMakanan() {
        return kodeMakanan;
    }

    public void setKodeMakanan(String kodeMakanan) {
        this.kodeMakanan = kodeMakanan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
