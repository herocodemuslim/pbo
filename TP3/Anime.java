import java.util.ArrayList;

public class Anime {
  // Atribut kelas
  private String judul;
  private String studio;
  private int jumlahEpisode;
  private ArrayList<Episode> daftar;
  
  // Constructor
  public Anime(String judul, String studio) {
    // Berikan nilai pada instance variable kelas nya
    this.judul = judul;
    this.studio = studio;
    
    // Buat object baru arraylist
    daftar = new ArrayList<Episode>();
  }

  public void displayInfoAnime() {
    // Tampilkan info anime kecuali detail daftar episode
    System.out.println("================================");
    System.out.println("Judul Anime \t: " + judul);
    System.out.println("Studio \t\t: " + studio);
    System.out.println("Jumlah Episode \t: " + jumlahEpisode);
  }

  // Method getter setter

  public void setDaftar(ArrayList<Episode> daftar) {
    this.daftar = daftar;
  }

  public ArrayList<Episode> getDaftar() {
    return daftar;
  }
  
  public void setJudul(String judul) {
    this.judul = judul;
  }

  public String getJudul() {
    return judul;
  }

  public void setStudio(String studio) {
    this.studio = studio;
  }

  public String getStudio() {
    return studio;
  }

  public void setJumlahEpisode(int jumlahEpisode) {
    this.jumlahEpisode = jumlahEpisode;
  }

  public int getJumlahEpisode() {
    return jumlahEpisode;
  }

}