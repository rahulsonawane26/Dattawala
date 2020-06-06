package Practise;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			for(int k=(10)-i;k>=1;k--) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {
			
				System.out.print("* ");
			
			}
			
			System.out.println();
		}

	}

}
