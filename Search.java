import java.io.*;
import java.util.*;
public class Search{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int key=in.nextInt();
		int[] a=new int[n];
		int i,flag=0;
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println("-1");
		}
	}
}