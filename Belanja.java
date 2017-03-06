import java.util.Scanner;

class Belanja{
	
	public static void main(String[] args){
		
		int bil = 1;
		int totalharga;
		int totalbayar = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Member ? (YA / TIDAK) : ");
		String member = s.nextLine();
		
		while(bil <100){
			
			totalharga = totalbayar;
			
			System.out.print("Harga Barang : ");
			int harga = s.nextInt();
			
			totalbayar = totalharga+harga;
			
			System.out.println("Total Bayar Anda Adalah : " + totalbayar);
			
			System.out.print("-------------------------------------------");
			
			System.out.print("Transaksi Lainnya ? (1 = YA / 0 = TIDAK) : ");
			int trans = s.nextInt();
			
			if (trans == 1) {
				bil++;
			}else{
				bil= 101;
			}
			
		}
		
		if (member.equals("YA")){
			
			int diskon = totalbayar * 10/100;
			int totalbayarbgt = totalbayar - diskon;
			
			System.out.println("Total Bayar Anda Adalah : " + totalbayarbgt + " Dengan Diskon ");
		}else{
			System.out.println("Total Bayar Anda Adalah : " + totalbayar);
		}
	}
}