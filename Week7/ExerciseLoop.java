
public class ExerciseLoop {

	public static void main(String[] args) {
		
		System.out.println("1.");
		int max = 5;
		for (int n=1; n<= max; n++) {
			System.out.println(n);
			
		}
		System.out.println();
		
		// while loops
		int n = 1;
		System.out.println("1-");
		while (n<=max) {
			System.out.println("Number 1: "+n);
			n++;
		}
		
		System.out.println("2.");
		int total = 25;
		for (int number = 1; number <= (total / 2); number++) {
			total = total - number;
			System.out.println(total + " " + number);
		}
		System.out.println();
		
		
		//while loops
		System.out.println("2-");
		
		int number = 1;
		total = 25;
		while (number <= (total /2)) {
			total = total - number;
			System.out.println("Number 2: " + total + " " + number);
			number++;
		}
		
		System.out.println("3.");
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 1; k <= 4; k++) {
					System.out.print("*");
				}
				System.out.print("!");
			}
			System.out.println();
		}
		System.out.println();
		
		// while loops
		System.out.println("3-");
		
		int i = 1;
		while (i <= 2) {
			i++;
			
			int j = 1;
			while(j <= 3) {
				j++;
				
				int k = 1;
				while (k <= 4) {
					k++;
					System.out.print("*");
					
				}
				System.out.print("!");
				
			}
			System.out.println();
		}
		
		System.out.println("4.");
		int num = 4;
		for (int count = 1; count <= num; count++) {
			System.out.println(num);
			num = num / 2;
			
		}
		System.out.println();
		
		// while loops
		System.out.println("4-");
		
		
		num = 4;
		int count = 1;
		while (count <= num) {
			System.out.println("Number 4: " + num);
			count++;
			num = num / 2;
		}
	}
	
				
				
			
				
}
