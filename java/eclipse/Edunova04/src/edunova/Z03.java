package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		// korisnik unosi 5 brojeva
		//program ispisuje najveći
		
		int i=0; 
		int max=0;
		while(i<5) {
			 int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));
			 if(b>max) {
				 max=b;
			 }
			 i++;
		}
		
		System.out.println(max);

	}

}
