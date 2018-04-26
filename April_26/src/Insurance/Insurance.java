package Insurance;

public class Insurance {

	String name;
	int age, weight, income;

	public Insurance(String n, int a, int w, int i){

		name=n;
		age=a;
		weight=w;
		income=i;

	}

	public static void main(String[]args){

		Insurance person=new Insurance("Jon", 18, 180, 20000);
		Insurance person2=new Insurance("Andrew", 35, 195, 45000);
		Insurance person3=new Insurance("Lisa", 45, 200, 50000);
		Insurance person4=new Insurance("Garnett", 59, 210, 100000);

		Insurance[]people={person, person2, person3, person4};

		for(int i=0; i<people.length; i++ ){

			if(people[i].age<=18){

				System.out.println(people[i].name + " is in the minor category.");
			}

			if(people[i].age>18 && people[i].age<=38 && people[i].weight<=200){

				System.out.println(people[i].name + " is in the healthy category.");
			}

			if(people[i].age>38 && people[i].age<58 && people[i].income>=50000){

				System.out.println(people[i].name + " is in the low-risk category.");
			}

			if(people[i].age>58){

				System.out.println(people[i].name + " is in the high-risk category.");
			}
		}
	}
}