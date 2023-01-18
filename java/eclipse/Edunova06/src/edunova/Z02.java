package edunova;

public class Z02 {
	
	public static void main(String[] args) {
		
		//program unosi dva imena osoba i ispisuje koliko se vole
		//metodom slučajnog broja od 10 do 90
	
			String tvojeIme=Pomocno.obavezanUnosStringa("Unesi svoje ime:");
			String imeSimpatije=Pomocno.obavezanUnosStringa("Unesi ime tvoje simpatije:");
			
			int slucajniBroj=Pomocno.slucajniBrojUrasponu(10, 90);
			
			System.out.println(tvojeIme+" i "+imeSimpatije+" se vole "+slucajniBroj+"%");
		
		
		
	}

}
