package edunova;

public class E_7 {

	public static void main(String[] args) {
		// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
		//What is the 10 001st prime number?
		
		int i,j;
		int zastavica;
		int index=0;
		int polje[] = new int [1000];
		
		for(i=2;i<=1000;i++) {
			zastavica=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					zastavica=1;
					break;
				}
			}
			if (zastavica==0) {
				polje[index++] = i;
			}
			
			if(polje.length > 1000) {
				break;
			}
		}
		
		System.out.println(polje[1000]);

	}

}
