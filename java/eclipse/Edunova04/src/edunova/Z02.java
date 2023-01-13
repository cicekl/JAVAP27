package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		// korisnik unosi 5 brojeva
		//između 2 i 4
		//program ispisuje njihov umnožak
		int i=0;
		int umnožak = 1;
		while(i<5) {
			
			int b= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 2 i 4:"));
			
			if(b>=2 && b<=4) {
				umnožak*=b;
				i++;
			}
			
			
		}

		System.out.println(umnožak);
	}

}
