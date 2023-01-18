package edunova;

public class Z01 {
	
	public static void main(String[] args) {
		
		//program od korisnika traži ukupan broj predmeta u školi
		//unosi ocjene za svaki predmet i ispisuje prosjek
		
		int suma=0;
		
		int ukupnoPredmeta = Pomocno.ucitajCijeliPozitivniBroj(
				"Unesite ukupan broj predmeta za koji želite prosjek");
		for(int i=0;i<ukupnoPredmeta;i++) 
			suma+=Pomocno.ucitajCijeliBrojURasponu(
					"Unesite " + (i + 1) + ". ocjenu", 
					1, 5);
		
		System.out.println(suma/(float)ukupnoPredmeta);
		}
		
	
		
	}


