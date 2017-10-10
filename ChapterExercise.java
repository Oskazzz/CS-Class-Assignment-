import java.util.Scanner;

public class ChapterExercise {

	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		System.out.println("What's the day?");
		String day=in.nextLine();
		System.out.println("What's the month?");
		String month=in.nextLine();
		System.out.println("What's the date");
		int date=in.nextInt();
		System.out.println("What's the years?");
		int year=in.nextInt();
		System.out.printf("Today is %s, %s, %d, %d .", day, month, date,year);
	}
	
	
}
