package edunova;

public class Osoba {
	
	//ovo znati u svako doba dana i noći
	//klasa je opisnik objekta!!
	
	//ovo ne valja i nećemo tako raditi
	
	// String ime;
	// String prezime;
	// int godine;
	
	//OOP učahurivanje
	//klasa će sakriti svoja svojstva
	
	private String ime;
	private String prezime;
	private int godine;
	
	
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
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	
	//klasa će svojstva učiniti dostupnima putem
	//javnih metoda koje se nazivaju
	//Accessors and mutators - geteri i seteri
	
	

}
