package Practise;

public class ThreeAndFive {

	public static void main(String[] args) {

		System.out.println("Numbers that are divisible by three from 1 to 100 are: ");
		for(int i=1;i<=100;i++) {
			

			if (i%3==0 ) {
				
				System.out.print(" "+i);
			}
		}
			
		System.out.println();
		System.out.println("Numbers that are divisible by five from 1 to 100 are: ");
			
			for(int j=1;j<=100;j++) {
			
			if(j%5==0) {
				
				System.out.print(" "+j);
			}
			
			}
			System.out.println();
			
			System.out.println("Numbers that are Prime from 1 to 100 are: ");
			for(int k=2;k<=100;k++) {
				
				if( (k==2) || k%2==1) {
					
					System.out.print(" "+k);
				}
			}
			System.out.println();
			
			System.out.println("Numbers having both digit same are: ");
			for(int l=1;l<=100;l++) {
				
				if(l%11==0 ) {
					
					System.out.print(" "+l);
				}
			}
	}}

	


