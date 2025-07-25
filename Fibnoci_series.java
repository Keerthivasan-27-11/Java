package myprojects;

public class Fibnoci_series {
	public static void main(String[] args) {
		int a=0,b=1,c=0,i,j;
		for(i=0;i<=10;i++) {
			c=a+b;
			b=a;
			a=c;
			System.out.println(c);
		}
	}
}
