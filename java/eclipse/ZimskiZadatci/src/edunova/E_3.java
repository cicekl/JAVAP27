package edunova;

public class E_3 {

	public static void main(String[] args) {
		
		//The prime factors of 13195 are 5, 7, 13 and 29.
		//What is the largest prime factor of the number 600851475143 ?
		
		long broj = 600851475143L;
		int i, j;
		int spremnik1[] = new int [71];
		int spremnik2[] = new int [71];
		
		for(i=2;i<=600851475143L;i++) {
			if (broj%i==0) {
				spremnik1[i] = (int) broj%i;
			}
			
			for(j=2;j<=i/2;j++) {
				if(i%j==0) {
					spremnik2[j]= i%j;
					break;
				}
			}
			
			
		}
		
		int max=-1;
		
		for(i=0;i<100;i++) {
			if(spremnik1[i]<spremnik2[i]) {
				max=spremnik1[i];
			}else {
				max=spremnik2[i];
			}
		}
		
		

	}

}
