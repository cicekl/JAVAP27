package edunova;

public class E01_VrsteMetoda {

	//funkcije,procedure
	//svaka metoda ima: način pristupa(public,private,protected,bez načina pristupa),
	//oznaku(static, bez oznake -> static se moze pozivati s klase bez kreiranja instance),
	//tip podatka(svi java tipovi ili void -> void nema return),
	//naziv metode, 
	//lista parametara odvojena zarezom -> tip podatka i naziv
	
	//4 vrste metoda
	//1. vrsta
	//ne prima parametre, ne vraća vrijednost(nema return)
	
	public static void m1_pozdravi() {
		
		//lista parametara prazna - ne prima vrijednost
		
		//10 puta jedno pokraj drugog se ispisuje "hello"
		for(int i=0;i<10;i++) {
			System.out.print("Hello ");
		}
	}
	
	//2. vrsta
	//ne prima parametre, vraća vrijednost
	
	public static int m2_slucajniBroj() {
		int sb = (int) (Math.random()*100);
		return sb;
		
		//vraća vrijednost tipa int jer je to podatak metode
	}
	
	//3. vrsta
	//prima parametre, ne vraća vrijednost
	
	public static void m3_zbroji(int a, int b, int c) {
		
		int r= a + b;
		float f = r/c;
		System.out.println(f * 10);
	}
	
	//4. vrsta
	//prima parametre i vraća vrijednost
	
	public static boolean m4_prim(int broj) {
		//djeljiv s 1 i sam sa sobom
		
		for(int i=2; i<broj;i++) {
			if(broj%i==0) {
				return false; //short cuircuting
			}
			else { 
				return true;
			}
		}
	}
	
	
	
}
