import java.util.Scanner;

class Karyawan{
	
	public static void main(String[] args) {
		
		int Karyawan;
		Scanner pencet = new Scanner(System.in);
		
		System.out.print("Masukan Jumlah Gaji : ");
		String status = pencet.nextLine();
		
		System.out.print("Mempunyai Anak ? : ");
		int gaji = pencet.nextInt();
		
		if (status.equals("YA")) {
			Karyawan = gaji + 1000000;
			
		}else{
			Karyawan = gaji;
		}
		System.out.print("total gaji Anda adalah = "+ Karyawan);
	}
}
