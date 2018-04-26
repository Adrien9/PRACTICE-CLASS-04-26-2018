package Even;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("How many numbers do you want to enter?");
		int answer=scanner.nextInt();

		System.out.println("Enter " + answer + " numbers.");
		
		int[]numbers=new int[answer];

		for(int i=0; i<numbers.length; i++){

			numbers[i]=scanner.nextInt();
		}

		for(int i=0; i<numbers.length; i++){
			
			if(numbers[i]%2==0){
				
				System.out.println(numbers[i]);
				
			}
		}
	}
}
