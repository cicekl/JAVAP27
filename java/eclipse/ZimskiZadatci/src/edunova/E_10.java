package edunova;

public class E_10 {
	public static void main(String[] args) {
		
	//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	//Find the sum of all the primes below two million.
		
	int i,j;
	int zastavica;
	long zbroj=0L;
		
		for(i=2;i<2000000;i++) {
			zastavica=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					zastavica++;
				}
			}
		
			if(zastavica==0 && i!=1) {
				zbroj+=i;
			
			}
			
		
	}
		System.out.println(zbroj);
		
	}

}
