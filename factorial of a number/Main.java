import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number for factorial : ");
		int i,a,fact=1;
		a=input.nextInt();
		for(i=1;i<=a;i++)
		{
		    fact=fact*i;
		}
		System.out.println("The factorial of "+ a +" is : "+fact);
	}
}
