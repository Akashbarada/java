import java.util.*;
class test7
{
	public static void main(String  [] args)
    {
		Scanner sc= new Scanner (System.in);
		int n,m;
		System.out.println("enter a no");
		n=sc.nextInt();
		m=sc.nextInt();
		if(n>m)
		{
			System.out.println("greatest"+n);
		}
		else
		{
			System.out.println("greatest"+m);
		}
	}	
}