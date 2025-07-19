package myproject;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("Enter the number to be checked :");
	
		int aq=num.nextInt();
		System.out.println("Prime :1");
		for(int a=2;a<=aq;a++) {
		int count=0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime :"+a);
		}
		else {
			System.out.println("Not Prime");
		}
	}}
}

