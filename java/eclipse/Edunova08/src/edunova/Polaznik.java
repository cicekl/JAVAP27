package edunova;

public class Polaznik extends Osoba  {
	
private String brojUgovora;
	
	// konstruktor, poziva se s ključnom riječi new
	public Polaznik() {
		//super(); // poziv konstruktora iz klase Osoba
		System.out.println("Konstruktor Polaznik");
	}
	
	public Polaznik(String ime, String prezime, String brojUgovora) {
		super(ime, prezime);
		this.brojUgovora = brojUgovora;
	}


	public String getBrojUgovora() {
		/*protected u nadklasi*/
		status=1;
		/*package u nadklasi*/
		broj=2;
		
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		// this je ova klasa u kojoj se nalazim
		this.brojUgovora = brojUgovora; // bez this je varijabla u ovoj metodi u kojoj se nalazim
		
		super.brojUgovora="fiksno";
		// broj je varijabla u nad klasi
		broj=3;
		
	}
	
	@Override
	public String pozdravi() {
		return "Polazniče " + super.pozdravi();
	}

}
