package edunova;

public class E01_UvjetnoGrananjeIf {

	public static void main(String[] args) {

		boolean uvjet = true;

		if (uvjet) {

			System.out.println("1");

		}

		int i = 7;

		if (i < 10) {
			System.out.println("2");
		}

		uvjet = i < 5;
		
		if(uvjet) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
		
		// operator različito
		
		if(i!=6) {
			System.out.println("5");
		}
		
		//& provjerava oba uvjeta, && provjerava samo jedan uvjet ako je prvi false
		
		if(i<8 && i>12) {
			System.out.println("6");
		}else {
			System.out.println("7");
		}
		
		//ista stvar s ili ||
		
		if(i<8 || i>12) {
			System.out.println("8");
		}else {
			System.out.println("9");
		}
		
		//ugnježđeni if
		
		if(i>0) {
			if(i<100) {
				System.out.println("10");
			}
		}
		
		//tercijarni operator
		System.out.println(i<100 ? "true" : "false");

	}

}
