package edunova;

import javax.swing.JOptionPane;

public class Kalkulator {
	
	public static void main(String[] args) {
		
		String prvoIme = JOptionPane.showInputDialog("Unesi prvo ime");
		
		String drugoIme = JOptionPane.showInputDialog("Unesi drugo ime");
		
		int ljubav = (int)(Math.random()*100);
		
		System.out.println(prvoIme + " i " + drugoIme + " se vole " + ljubav + "%");
		
	}

}
