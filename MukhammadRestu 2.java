import java.util.Scanner;

class MukhammadRestu {
	
	public static void main(String [] args){
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Masukan Nama Kamu :");
		String Nama= scan.nextLine();
		
		
		System.out.print("Masukan Kelas Kamu :");
		String Kelas= scan.nextLine();
		
		if (Nama.equals("Agung") && Kelas.equals("XI RPL 2"))
		{
		System.out.print("Pulang");}
		else
		{
			System.out.print("gagal");
		}
	
	}	
}