import java.util.*;
class test4
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int n,r=0;
		System.out.println("enter a number");
		n=sc.nextInt();
		r=n%10;
		if(r==4)
		{
			System.out.println("unit's place");
		}
		else
		{
			System.out.println("not unit's place");
		}
	}
}