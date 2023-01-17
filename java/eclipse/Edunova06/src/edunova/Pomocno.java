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
			return ucitajCijeliBroj("Unesi broj", "Greška kod unosa broj");
		} 
	}

