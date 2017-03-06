import java.util.Scanner;
import java.io.*;
import java.io.File;

class Tabungan{
	public static void main(String[] args) throws Exception {
	
	int Pilihan,saldo,saldobaru,saldolama,pin,ambil,menu,nabung,data;
	

	
		Scanner s = new Scanner(System.in);
		Scanner ketik = new Scanner (System.in);
		System.out.print("Masukan PIN Anda : ");
		String Pin = s.nextLine();
		FileInputStream input = null;
		FileOutputStream foutput = null;
		
		
	
		if (Pin.equals("1234")){
			System.out.println("**********==========**********");
			System.out.println("* Menu Yang Tersedia di ATM   ");
			System.out.println("*		1.Cek Saldo           ");
			System.out.println("*		2.Menabung            ");
			System.out.println("*		3.ambil               ");
			System.out.println("**********==========**********");
			
			
			int pilihan = s.nextInt();
			switch (pilihan) {
			
			
			case 1: System.out.println("Cek Saldo");
					saldolama = 10000000;
					System.out.println("Saldo Anda adalah = Rp. "+saldolama);
					
					try{
			
					File file = new File("angka.txt");
					Scanner fileinput = new Scanner(file);
		
					while(fileinput.hasNextLine()){
				
					saldolama = fileinput.nextInt();
				
					}
			
					fileinput.close();
			
					}catch(Exception ex){
						ex.printStackTrace();
					}
					
					break;
					
			case 2: System.out.println("========================================");
					System.out.println("Berapakah Uang Yang Ingin Anda Masukan ? ");
					saldolama = s.nextInt();
					
					
					
					System.out.println("========================================");
					saldo = 10000000 + saldolama;
					System.out.println("Uang Anda Sekarang adalah  "+saldo);
					
					break;
					
					
			case 3: System.out.println("========================================");
					System.out.println("Berapakah Uang Yang Ingin Anda Ambil ? ");
					saldolama = s.nextInt();
					
					
					
					System.out.println("========================================");
					saldo = 10000000 - saldolama;
					System.out.println("Uang Anda Sekarang adalah  "+saldo);
					
					
			
		}
			
		}else{
			System.out.print("Pin Kamu Salah");
		}
		
		
	
	}
	
	
	
	
	
}