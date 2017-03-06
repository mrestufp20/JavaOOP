class Binatang	{
	
	//atribut
	String nama;
	int kaki = 4;
	
	//method
	void	makan(String a)	{
		System.out.println(nama + "Bisa Makan "  +a);
		
		
	}
	
	void tidur()	{
		System.out.println("Bisa Tidur ");
		
		
	}
	
	
}



class objek	{
	
	public static void main(String[] args)	{
		
		Binatang sapi = new Binatang();
		sapi.nama = "Jainal ";
		sapi.makan(" Apel");
		
		Binatang serigala = new Binatang();
		serigala.nama = "Serigala ";
		serigala.makan(" daging");
		
		Binatang onta = new Binatang();
		onta.nama = "Onta ";
		onta.makan(" Rumput");
		
		
	}
	
}