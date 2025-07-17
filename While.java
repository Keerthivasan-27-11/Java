package myproject;

public class While {
public static void main(String[] args) {
	int i=1;
	System.out.println("While");
	/*While loop executes the statement block after the evaluation of the condition.*/
	while(i<=0) {
		System.out.println(i);
		i++;
	}
	System.out.println("dowhile");
	/*do while loop executes the statement block before the evaluation of the codition.*/
	do {
		System.out.println(i);
		i++;
	}while(i<=0);
}
}
