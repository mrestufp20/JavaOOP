import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

class Tulis{
	
	public static void main(String[] args){
		
		Scanner ketik = new Scanner (System.in);
		FileOutputStream foutput = null;
		
		System.out.print("Masukan Ketikan : ");
		String tulisan = ketik.nextLine();
		
		//membuka file txt
		try{
			
			foutput = new FileOutputStream("bacalah.txt");
			
		}catch	(IOException e){
			
			
		}
		
		//menulis data kedalam file 
		try{
			for (int i=0; i< tulisan.length(); i++)
				foutput.write((int) tulisan.charAt(i));
		
		}catch(IOException e){}
		
		//menutup file kembali
		try{
			foutput.close();
			
		}catch (IOException e){}
		
		
		
	}
	
}