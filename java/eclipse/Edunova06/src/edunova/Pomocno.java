package edunova;
import javax.swing.JOptionPane;

public class Pomocno {
	
	
	public static int ucitajCijeliBroj(String porukaKorisniku, String obavijestOGresci) {
		
		while(true) {
			
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(porukaKorisniku));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, obavijestOGresci);
			}
		} }
		
		public static int ucitajCijeliBroj() {
			return ucitajCijeliBroj("Unesi broj.", "Greška kod unosa broja! Pokušaj ponovno.");
		} 
		
		public static String obavezanUnosStringa(String poruka) {
			String s = "";
			while (s.isEmpty()) {
				s = JOptionPane.showInputDialog(poruka);
				if (s.length() > 0) {
					return s;
				}
			}
			return "";
		}
		
		
	}

