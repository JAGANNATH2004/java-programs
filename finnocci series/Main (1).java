import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int a=0,b=1,c=0;
	    System.out.println("Enter the limit for Fibonnacci series : ");
	    int n=input.nextInt();
	    System.out.println("\n");
	    System.out.println("series begins here : ");
	    for(int i=0;i<=n;i++)
	    {
	        c=a+b;
	        System.out.println((i+1)+") "+c);
	        b=a;
	        a=c;
	    }
	    System.out.println("The limmit ends here......");
	    System.out.println("\n"+"THANK YOU");
	}
}
