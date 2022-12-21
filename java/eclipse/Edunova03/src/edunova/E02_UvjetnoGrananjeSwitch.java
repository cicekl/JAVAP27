package edunova;

import javax.swing.JOptionPane;

public class E02_UvjetnoGrananjeSwitch {

	public static void main(String[] args) {
		
		int ocjena = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj od 1 do 5"));
		
		switch(ocjena) {
		
		case 1: System.out.println("Nedovoljan");
			break;
		case 2: System.out.println("Dovoljan");
			break;
		case 3: System.out.println("Dobar");
		break;
		case 4: System.out.println("Vrlo dobar");
		break;
		case 5: System.out.println("Odličan");
		break;
		default: System.out.println("Unesen broj nije ocjena");
		break;
		
		}
		
	}
	
}
