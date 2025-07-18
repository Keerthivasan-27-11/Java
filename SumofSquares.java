package myfirstproject;
import java.util.Scanner;
public class SumofSquares {
public static void main(String[] args) {
	Scanner num=new Scanner(System.in);
	int i,sum=0;
	int[] a=new int[100];
	for(i=1;i<=5;i++) {
		System.out.println("Enter the array elements :");
		a[i]=num.nextInt();
	}
	for(i=0;i<=5;i++) {
		System.out.println(" "+a[i]);
	}
}
}
