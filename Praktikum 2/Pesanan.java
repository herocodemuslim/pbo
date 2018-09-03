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
public class Pesanan {
    // Atribut
    private Makanan food;
    private Minuman drink;
    
    // Constructor
    public Pesanan() {
        
    }
    
    public Pesanan(Makanan _food, Minuman _drink) {
        food = _food;
        drink = _drink;
    }
    
    // Method setter dan getter

    public Makanan getFood() {
        return food;
    }

    public void setFood(Makanan food) {
        this.food = food;
    }

    public Minuman getDrink() {
        return drink;
    }

    public void setDrink(Minuman drink) {
        this.drink = drink;
    }
    
    // Fungsi menghitung jumlah bayar
    public float getJumlahBayar(int jumlahMakanan, int jumlahMinuman) {
        float totalBayar = 0f;
                
        // Ambil harga dan kalikan dengan jumlah makanan
        float totalHargaMakanan = (float) (food.getHarga() * jumlahMakanan);
        float totalHargaMinuman = (float) (drink.getHarga() * jumlahMinuman);
        
        // Hitung jumlah total
        totalBayar = totalHargaMakanan + totalHargaMinuman;
        
        return totalBayar;
    }
}
