package Average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many numbers do you want to enter?");
		int answer=scanner.nextInt();

		System.out.println("Enter " + answer + " numbers.");

		double sum=0;
		double average = 0;
		
		int[]numbers=new int[answer];

		for(int i=0; i<numbers.length; i++){

			numbers[i]=scanner.nextInt();
		}

		for( int i=0; i<numbers.length; i++){
			
			sum=sum+numbers[i];
			average=sum/numbers.length;
		}
		
		System.out.println(average);
	}
}
