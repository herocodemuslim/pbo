public class Episode {
  // Atribut kelas
  private String judul;
  private String durasi;

  // Constructor kosong
  public Episode() {
  }

  // Constructor dengan parameter judul dan durasi
  public Episode(String judul, String durasi) {
    this.judul = judul;
    this.durasi = durasi;
  }

  public void lihatInfoEpisode() {
    System.out.println("Judul \t\t: " + judul);
    System.out.println("Durasi \t\t: " + durasi);
  }

  public void setJudul(String judul) {
    this.judul = judul;
  }

  public String getJudul() {
    return judul;
  }

  public void setDurasi(String durasi) {
    this.durasi = durasi;
  }

  public String getDurasi() {
    return durasi;
  }

}