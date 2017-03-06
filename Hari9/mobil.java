class Pabrik {
	
	
	//atribut
	String merktipe;
	private	int kecepatanmax;
	
	
	//setter
	void setkecepatan(int a)	{
		
		
		if (a <= 20000)	{
			kecepatanmax	=	a;
		
		}	else {
			kecepatanmax	=	20000;
			
		}
		
	}
	
	//getter
	int getkecepatan()	{
		
		return kecepatanmax;
		
	}
	
	
	//method prosedural	+ parameter
	void Belok (String arah)	{
		System.out.println	(	merktipe	+	"Ban Miring Ke Sebelah	"	+	arah);
		
		
	}
	
	void Bergerak	(String posisi)	{
		System.out.println	(	merktipe	+	"Ban Berputar Ke Arah	"	+	posisi);
		
		
	}
	
}

class mobil	{
	
	public static void main(String[]	args)	{
		
		
		Pabrik honda1	=	new Pabrik();
		honda1.merktipe	=	" CRV	";
		honda1.Belok("Kanan");
		honda1.Bergerak("Kedepan");
		honda1.setkecepatan(20000);
		int kecepatan	= honda1.getkecepatan();
		System.out.println(kecepatan);
		
		
		
		Pabrik honda2	=	new Pabrik();
		honda2.merktipe	=	" JAZZ	";
		honda2.Belok("Kekiri");
		honda2.Bergerak("Kebalakang");
		
	}
	
	
	
}