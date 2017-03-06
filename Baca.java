import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


class Baca{
		public static void main(String[] args) {
			
			int data;
			FileInputStream input = null;
			
			
			//mencari fileInputStream
			try{
				input = new FileInputStream("bacalah.txt");
			}catch(FileNotFoundException e){
				System.out.println("File Tidak Ada.... Ntah......  ");
			}
			
			
			//membaca file
			try{
				while((data = input.read()) !=-1){
					System.out.print((char)data);
				}
				System.out.println();
				
			}catch(IOException e){}
			
			
			//menutup file
			try{
				input.close();
			}catch(IOException E){}
			
			
		}
		
}