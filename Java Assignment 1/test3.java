import java.util.*;
class test3
{
	public static void main(String [] args)
	{
	   Scanner sc=new Scanner(System.in);
		int  num;
		System.out.println("enter a number");
		num= sc.nextInt();
		if(num>=0) 
		{
			System.out.println("+ve");
		}
		else
		{
			System.out.println("-ve");
		}
	}
}