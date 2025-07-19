package myproject;
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
	
		Scanner num =  new Scanner(System.in);
		
		System.out.println("Enter the starting year :");
		
		int year = num.nextInt();
		
		System.out.println("Enter the ending year :");
		
		int end = num.nextInt();
		for(int i=year;i<=end;i++) {
			if(i%4==0) {
						System.out.println("Leap year :"+i);
			}
		}
}
}
