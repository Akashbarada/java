import java.util.*;
class test9
{
	public static void main(String  [] args)
    {
		Scanner sc= new Scanner (System.in);
		int n,m,p;
		System.out.println("enter a no");
		n=sc.nextInt();
		m=sc.nextInt();
		p=sc.nextInt();
		if(n>m && n>p)
		{
			System.out.println("greatest"+n);
		}
		else if(m>p)
		{
			System.out.println("greatest"+m);
		}
		else
		{
			System.out.println("greatest"+p);
		}
	}	
}