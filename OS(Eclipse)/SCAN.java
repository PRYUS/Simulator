import java.util.*;
public class SCAN{
	public int main(int A[],int n,int head)
	{	
		int answer;
		if(head<100)
		{	
			int maximum=max(A,n);
			answer=(head-0)+(maximum-0);
		}
		else
		{	int minimum=min(A,n);
			answer=(199-head)+(199-minimum);
		}
		return answer;
	}
	public static int min(int A[],int n)
	{	int minimum=A[0];
		for(int i=1;i<n;i++)
		{
			if(A[i]<minimum) 
				minimum=A[i];
		}
		return minimum;
	}
	public static int max(int A[],int n)
	{	int maximum=A[0];
		for(int i=1;i<n;i++)
		{
			if(A[i]>maximum) 
				maximum=A[i];
		}
		return maximum;
	}
	
}
