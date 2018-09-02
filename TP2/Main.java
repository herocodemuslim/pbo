
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Buat objek scanner
		Scanner in = new Scanner(System.in);

		// Ambil input data user
		System.out.print("Siapa nama kamu \t : ");
		String nama = in.nextLine();

		System.out.print("Jenis kelamin (L/P) \t : ");
		String kodeJenisKelamin = in.nextLine();

		// Logic Konversi kode jenis kelamin ke versi lengkap
		String jenisKelamin = "Tidak diketahui";
		if (kodeJenisKelamin.equals("L")) {
			jenisKelamin = "Laki-laki";
		} else if (kodeJenisKelamin.equals("P")) {
			jenisKelamin = "Perempuan";
		}

		System.out.print("Makanan Kesukaan \t : ");
		String makananKesukaan = in.nextLine();

		// Cara 1 constructor kosong
		Makanan makanan = new Makanan();
		// Menge-set nilai variable dalam objek makanan menggunakan method nya
		makanan.setNama(makananKesukaan);

		Manusia manusiaHero = new Manusia();
		manusiaHero.setNama(nama);
		manusiaHero.setJenisKelamin(jenisKelamin);

		manusiaHero.makan(makanan);


		// Cara 2 constructor satunya lagi dan mengeset nya langsung
		Manusia manusiaKeren = new Manusia("Nanami", "Perempuan");
		Makanan makanan2 = new Makanan("Es Dawet");
		manusiaKeren.makan(makanan2);
	}

}

