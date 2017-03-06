import java.util.Scanner;

class Luas{
	
	public static void main(String[] args) {
		
		int a, t, l, pilihan;
		Scanner s = new  Scanner(System.in);
		
		System.out.print("Masukan Nilai Alas : ");
		a = s.nextInt();
		
		System.out.print("Masukan Nilai Tinggi : ");
		t = s.nextInt();
		
		System.out.print("Rumus {1}segitiga {0}kubus : ");
		pilihan = s.nextInt();
		
		if (pilihan==1) {
			l = a*t /2;
			System.out.println("Luas Segitiga : " +l);
		}else{
			l = a*t;
			System.out.println("Luas persegi : " +l);
		}
	}
}