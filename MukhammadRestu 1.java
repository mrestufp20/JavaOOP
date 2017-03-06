import java.util.Scanner;

class MukhammadRestu {
	
	public static void main(String [] args){
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Masukan Nama Kamu :");
		
		String text= scan.nextLine();
		
		if (text.equals("siti")){
			System.out.println("Siti Geura Bayar Batagor");
		}
		else
		{
			System.out.println(" Hai " + text + " Kamu Sudah Lunas");
		}
	}
	
}