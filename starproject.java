package myproject;
import java.util.Scanner;
public class starproject {
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		int a=1;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}		
		}
	}
