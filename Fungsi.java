class Fungsi{
	
		public static void main (String [] args) {
			
			int a = 10;
			int t = 12;
			
			int hasil = persegi (9, 10);
			System.out.println (hasil);
			segitiga (12, 14);
		}
	
		static int persegi (int a, int t) {
			int l = a * t;
			
			return l;
			
		}
	
		static void segitiga (int a, int t) {
			int l = (a * t)/2;
			
		}
	
}