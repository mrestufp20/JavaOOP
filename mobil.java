class Honda	{
	
	//atribut
	String warna;
	int ban = 4;
	
	//method
	void	belok(String belokke)	{
		System.out.println(" Berbelok Ke Arah" +belokke);
		
		
	}
	
	void gerak(String arahke)	{
		System.out.println(" Bergerak Ke Arah" +arahke);
		
		
	}
	
	
}



class mobil	{
	
	public static void main(String[] args)	{
		
		Honda jazz = new Honda();
		jazz.warna = "merah";
		jazz.belok(" Kiri");
		jazz.gerak(" Belakang");
		
		
		Honda brio = new Honda();
		brio.warna = "hijau";
		brio.belok = (" Kanan");
		brio.gerak = (" Mogok");
		
	}
	
}