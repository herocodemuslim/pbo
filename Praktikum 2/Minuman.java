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
public class Minuman {
        
    // Atribut
    private String kodeMinuman;
    private String nama;
    private double harga;
    
    // Constructor
    public Minuman() {
        
    }
    
    public Minuman(String _kodeMinuman, String _nama, float _harga) {
       kodeMinuman = _kodeMinuman;
       nama = _nama;
       harga = _harga;
    }
    
    // Method getter setter
    public String getKodeMinuman() {
        return kodeMinuman;
    }

    public void setKodeMinuman(String kodeMinuman) {
        this.kodeMinuman = kodeMinuman;
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
