import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // Buat object scanner
    Scanner read = new Scanner(System.in);
    
    // Ambil input data anime
    System.out.print("Masukkan judul anime: ");
    String judul = read.nextLine();
    System.out.print("Masukkan studio anime: ");
    String studio = read.nextLine();
    System.out.print("Masukkan jumlah episode anime: ");
    int jumlahEpisodeAnime = read.nextInt();

    Anime anime = new Anime(judul, studio);
    anime.setJumlahEpisode(jumlahEpisodeAnime);

    // lakukan perulangan untuk menginputkan episode anime berdasarkan jumlah episode yang di inputkan sebelumnya masukkan ke arraylist baru dan set ke arraylist pada kelas Anime
    read.nextLine();
    ArrayList semuaEpisode = new ArrayList();
    for (int i=1; i<=jumlahEpisodeAnime; i++) {
      System.out.println("Episode ke-"+i+": ");
      System.out.print("Judul Episode \t: ");
      String judulEpisode = read.nextLine();
      System.out.print("Durasi Episode \t: ");
      String durasi = read.nextLine();

      Episode episode = new Episode();
      episode.setJudul(judulEpisode);
      episode.setDurasi(durasi);

      semuaEpisode.add(episode);
    }

    // Set 
    anime.setDaftar(semuaEpisode);

    // Tampilkan info anime
    anime.displayInfoAnime();

    // Lakukan looping terhadap arrayList daftar untuk menampilkan detail episode
    ArrayList<Episode> episodes = anime.getDaftar();
    for (int i=0; i<episodes.size(); i++) {
      System.out.println("Episode ke-"+(i+1));
      (episodes.get(i)).lihatInfoEpisode();
    }
  }
  
}