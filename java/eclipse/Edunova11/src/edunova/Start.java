package edunova;

public class Start {
	
	public Start() {
		
		pozdravnaPoruka();
		glavniIzbornik();
		smjerIzbornik();
		odabirSmjerIzbornika();
		
		
	}
	
	private void odabirSmjerIzbornika() {
		
		
	}

	private void smjerIzbornik() {
		System.out.println("");
		System.out.println("Smjer izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih smjerova");
		System.out.println("2. Unos novog smjera");
		System.out.println("3. Promjena postojećeg smjera");
		System.out.println("4. Brisanje smjera");
		System.out.println("5. Povratak na glavni izbornik");
		
	}

	private void glavniIzbornik() {
		System.out.println("");
		System.out.println("Dostupne opcije");
		System.out.println("1. Smjerovi");
		System.out.println("2. Grupe");
		System.out.println("3. Polaznici");
		System.out.println("4. Predavaci");
		System.out.println("5. Izlazi iz programa");
		
	}

	private void pozdravnaPoruka() {
		System.out.println("Dobrodošli u Edunova terminal aplikaciju!");
		
	}

	public static void main(String[] args) {
		
		new Start();
	}

}
