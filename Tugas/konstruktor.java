class manusia{

	private String nama;
	String alamat;

	public manusia(){
		System.out.println("Objek Mahasiswa Dibuat!!!");
	}

	public String ambilnama(){
		return nama;
	}

	void ubahdata(String nama, String alamat){
		this.nama = nama;
		this.alamat = alamat;
	}

	void ubahnama(String nama){
		this.nama = nama;
	}
}

class konstruktor{

	public static void main(String[] args) {
		manusia orang = new  manusia();
	}
}