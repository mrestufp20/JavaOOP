import java.io.*;



class TulisFileWrite{
	public static void main(String[] args) {
		
		try{
			String tulis = "250000";
			
			
			File file = new File ("angka.txt");
			
			FileWriter fw = new FileWriter(file);
			fw.write(tulis);
			fw.close();
			
		}catch(IOException iox) {
			iox.printStackTrace();
		}
	
	}
	
	
}