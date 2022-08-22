import java.util.*;
class test5
{
	public static void main(String [] agrs)
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("enter a mnumber");
		n=sc.nextInt();
		if(n>99 && n<1000)
		{
			System.out.println("it is a 3 digit no");
	
		}
		else
		{
			System.out.println("is not a 3 digit no");
		}
	}
}