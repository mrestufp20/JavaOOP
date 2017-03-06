import java.util.Scanner;

class Soal{
	
		public static void main (String [] args) {
			
			int alas, tinggi, luas, pilih;
			Scanner s = new  Scanner(System.in);
			
			System.out.print("Masukan Nilai Alas : ");
			alas = s.nextInt();
		
			System.out.print("Masukan Nilai Tinggi : ");
			tinggi = s.nextInt();
		
			System.out.println("Pilihlah Rumus yang diinginkan ");
			System.out.println("====================");
			System.out.println("1.Rumus Persegi");
			System.out.println("2.Rumus Segitiga");
			System.out.println("====================");
			pilih = s.nextInt();
			
			if(pilih== 1) {
				luas = persegi(alas, tinggi);
				System.out.println("====================");
				System.out.println("Luas : " + luas);
				System.out.println("====================");
			}
			else{
				 segitiga(alas, tinggi);
				
			}
		}
	
		// contoh penulisan fungsi
		static int persegi (int a, int t) {
			int l = a * t;
			
			return l;
			
		}
	
		// contoh penulisan prosedur
		static void segitiga (int a, int t) {
			int l = (a * t)/2;
			System.out.println("====================");
			System.out.println("Luas : " + l);
			System.out.println("====================");
		}
	
}