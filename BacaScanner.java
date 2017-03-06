import java.io.File;
import java.util.Scanner;
import java.io.*;


class BacaScanner{
	
	public static void main(String[] args){
		
		int isi = 0;
		
		try{
			
			File file = new File("angka.txt");
			Scanner fileinput = new Scanner(file);
		
			while(fileinput.hasNextLine()){
				
				isi = fileinput.nextInt();
				
			}
			
			fileinput.close();
			
			int total = isi + 78;
			System.out.println("Hasil angka dari txt di tambah 78 adalah "+total);
			
		
		
		
		}catch(Exception ex){
				ex.printStackTrace();
		}
		
		
		
		
		
	}
	
}