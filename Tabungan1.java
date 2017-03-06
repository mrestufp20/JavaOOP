import java.io.File;
import java.util.Scanner;
import java.io.*;



class Tabungan1{
	public static void main(String[] args) {
		
		char Tabungan;
		int isi = 0;
		int tabungan;
		String totalbaru;
		int total;

	Scanner ketik = new Scanner(System.in);

	System.out.print("Masukan PIN Anda : ");
	String pin = ketik.nextLine();

	if(pin.equals ("1234")) {
			System.out.println("**********==========**********");
			System.out.println("* Menu Yang Tersedia di ATM   ");
			System.out.println("*		1.Cek Saldo           ");
			System.out.println("*		2.Menabung            ");
			System.out.println("*		3.ambil               ");
			System.out.println("**********==========**********");
		int menu = ketik.nextInt();

		String pilih;

		switch(menu){
			case 1: pilih = ("cek saldo");

	
			try{

			File file = new File("baru.txt");
			Scanner fileinput = new Scanner(file);

			while(fileinput.hasNextLine()){
				isi = fileinput.nextInt();
				}
				fileinput.close();

			
			System.out.print("Saldo Anda adalah " + isi);

		}catch(Exception ex){
			ex.printStackTrace();
		}
		break;


		case 2: pilih = ("menabung");

		try{

			File file = new File("baru.txt");
			Scanner fileinput = new Scanner(file);

				while(fileinput.hasNextLine()){
				isi = fileinput.nextInt();
			}

			fileinput.close();

			

		}catch(Exception ex){
			ex.printStackTrace();
		}

		System.out.print("Masukan Uang Anda ");
		 tabungan = ketik.nextInt();

		total = isi + tabungan ;

	
		
        totalbaru = Integer.toString(total);
			
			System.out.print("Tabungan Anda Saat ini adalah  " + total);
		try{
					

			File file = new File("baru.txt");

			FileWriter fw = new FileWriter(file);
		
			
			fw.write(totalbaru);
			fw.close();

		}catch(IOException iox){
			iox.printStackTrace();
		}
		break;

		case 3: pilih = ("Ambil rekening");	
		try{

			File file = new File("baru.txt");
			Scanner fileinput = new Scanner(file);

				while(fileinput.hasNextLine()){
				isi = fileinput.nextInt();
			}

			fileinput.close();

			

		}catch(Exception ex){
			ex.printStackTrace();
		}

		System.out.print("Masukan Uang Yang Ingin Anda Ambilkan  ");
		 tabungan = ketik.nextInt();

		total = isi - tabungan ;

	
		
        totalbaru = Integer.toString(total);
			
			System.out.print("Hasil Saldo Anda Sesudah Pengambilan Uang adalah  " + total);
		try{
					

			File file = new File("baru.txt");

			FileWriter fw = new FileWriter(file);
		
			
			fw.write(totalbaru);
			fw.close();

		}catch(IOException iox){
			iox.printStackTrace();
		}

	}
			
	}else{
		System.out.print("pin anda salah");
	}
}
}
