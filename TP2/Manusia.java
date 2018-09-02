// Masukkan kode2 untuk membuat waktu
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Manusia {

	// Perlu diperhatikan untuk penamaan parameter disini menggunakan underscore, meski nama parameter sama di tiap tiap method, tidak masalah karena punya masing2 (berdiri sendiri) maka tidak akan error

	// Buat atribut
	String nama;
	String jenisKelamin;

	// Buat 3 constructor
	Manusia() {
		// constructor kosong
	}

	Manusia(String _nama) {
		nama = _nama;
	}

	Manusia(String _nama, String _jenisKelamin) {
		nama = _nama;
		jenisKelamin = _jenisKelamin;
	}

	// Sehingga ketika membuat objek baru kita punya 3 opsi 

	// Method getter dan setter
	void setNama(String _nama) {
		nama = _nama;
	}
	
	String getNama() {
		return nama;
	}

	void setJenisKelamin(String _jenisKelamin) {
		jenisKelamin = _jenisKelamin;
	}

	String getJenisKelamin() {
		return jenisKelamin;
	}

	// Method menampilkan hasil akhir beserta jam
	void makan(Makanan makan) {
		Calendar kalender = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String waktuSekarang = sdf.format(kalender.getTime());

		System.out.println(nama + " adalah seorang " + jenisKelamin + " yang sedang makan " + makan.nama + " pada pukul " + waktuSekarang);
	}


}