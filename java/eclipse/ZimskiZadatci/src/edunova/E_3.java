package edunova;

public class E_3 {

	public static void main(String[] args) {
		
		//The prime factors of 13195 are 5, 7, 13 and 29.
		//What is the largest prime factor of the number 600851475143 ?
		
		long broj = 600851475143L;
		int i,j;
		int max=0;
		
		for(i=2;i<=broj;i++) {
			int zastavica = 1;
			
			for(j=2;j<i;j++) {
				if(i%j==0) {
					zastavica=0;
				}
			}
			
			if(broj%i==0) {
				
				if(zastavica==1) {
					if(i>max) {
						max=i;
					}
//					System.out.println(max);
					broj=broj/i;
				}
			}
		}
		
		System.out.println(max);
		
		

	}

}
