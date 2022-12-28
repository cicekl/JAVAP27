package edunova;

public class DrugiZadatak {
	
	public static void main(String[] args) {
		

//Kreirati program koji ispisuje tablicu množenja 15x15
	
	int tablica[] = new int [15];
	
	int i,j;
	for(i=1;i<16;i++) {
		for(j=1;j<16;j++) {
			if(i*j<10) {
		System.out.print(i*j + "   ");
		
		}else if(i*j>=10 && i*j<100){
			System.out.print(i*j + "  ");
		}else {
			System.out.print(i * j + " ");
		}
		
		}
		
		System.out.println();
	}
	

	
	
	}
}
