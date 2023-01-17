package edunova;

import javax.swing.JOptionPane;

public class E01_TryCatch {

	public static void main(String[] args) {

		int i = 0;
		String broj="";
		
		while(true) {
			
			try {
				
				broj=JOptionPane.showInputDialog("Unesi broj");
				i=Integer.parseInt(broj);
				break;
			}catch(Exception e) {
				
				JOptionPane.showMessageDialog(null, "Obavezan unos cijelog broja od " + " -2^31 fo 2^31-1");
				
			}
		}
		
		System.out.println(i);

	}

}
