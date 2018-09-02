public class Makanan {

	// Perlu diperhatikan untuk penamaan parameter disini menggunakan underscore, meski nama parameter sama di tiap tiap method, tidak masalah karena punya masing2 (berdiri sendiri) maka tidak akan error	

	// Buat atribut
	String nama;

	// Buat constructor
	Makanan() {
		// constructor kosong
	}

	Makanan(String _nama) {
		// constructor menge-set nama
		nama = _nama;
	}

	// Sehingga ketika membuat object baru kita punya dua opsi

	// Method getter dan setter
	// Method untuk menge-set nilai variable nama
	void setNama(String _nama) {
		nama = _nama;
	}

	// Fungsi untuk mengembalikan isi dari variable nama ke dunia luar
	String getNama() {
		return nama;
	}

}