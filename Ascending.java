import java.util.*;
class Ascending
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of list");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter list of elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(a[i]>a[j])
			{
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.println("elements in sorted order are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);	
		}
	}
}