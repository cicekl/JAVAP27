package edunova;

public class Osoba {
	
	private String ime;
	// prazan konstruktor
	public Osoba() {
		System.out.println("Konstruktor Osoba");
	}
	
	// puni konstruktor
	public Osoba(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}
	
	private String prezime;
	protected int status;
	int broj;
	protected String brojUgovora;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	public String pozdravi() {
		return ime + " " + prezime;
	}

}
