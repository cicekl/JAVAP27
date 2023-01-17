package edunova;

public class E02_Program {
	public static void main(String[] args) {

		// treba unijeti 5 brojeva
		// i ispisati njihov zbroj

		int suma = 0;
		int i = 0;
		
		for(i=0;i<5;i++) {
			
			suma+=Pomocno.ucitajCijeliBroj();
		}
		
		System.out.println(suma);

	}

}
