import java.io.*;
import java.util.*;
public class Sumarray
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int i,sum=0;
		float avg;
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("sum "+sum+"avg "+avg);

	}
}