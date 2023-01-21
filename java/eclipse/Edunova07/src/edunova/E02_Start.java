package edunova;

public class E02_Start {
	public static void main(String[] args) {
		
	//objekt je instanca klase!!
	//Osoba je tip podatka - klasa
	//osoba je instanca klase/objekt/varijabla
	//new: ključna riječ za poziv konstruktora klase
	
	Osoba osoba = new Osoba();
	
	//po OOP pravilima ne smije se omogućiti direktan pristup svojstvima
	// osoba.ime="Pero";
	//System.out.println(osoba.ime);

	
	//postavljanje vrijednosti svojstava na objekt
	osoba.setIme(Pomocno.obavezanUnosStringa("Unesi ime:"));
	osoba.setPrezime("Perić");
	osoba.setGodine(24);
	
	
	System.out.println(osoba.getIme());
	
	Osoba[] osobe = new Osoba[5];
	osobe[0]=osoba;
	
	osoba = new Osoba();
	osoba.setIme("Marina");
	
	osobe[1]=osoba;
	osobe[2]=kreirajOsobu("Ana", "Gal", 19);
	osobe[3]=kreirajOsobu("Tin", "Ked", 19);
	osobe[4]=kreirajOsobu("Lu", "Ked", 19);
	
	for(Osoba o: osobe) {
		System.out.println(o.getIme());
	}
	
	
	
	}
	
	private static Osoba kreirajOsobu(
			String ime, String prezime, int godine) {
		Osoba osoba = new Osoba();
		osoba.setGodine(godine);
		osoba.setIme(ime);
		osoba.setPrezime(prezime);
		return osoba;
	}
}
	

