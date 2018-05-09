import java.util.Scanner;
import java.util.*;
public class SSTF{
	public int main(int A[],int num,int head)
	{	
		int[] queue=Arrays.copyOf(A,num);
		int temp=0;
			int [] use=new int[num];
			for(int j=0;j<num;j++)
			{
					use[j]=Math.abs(queue[j]-head);
			}
			for(int j=0;j<num;j++)
			{
				for(int k=0;k<num;k++)
				{
					if(use[k]>use[j])
					{
						int t=use[k];
						use[k]=use[j];
						use[j]=t;
						t=queue[k];
						queue[k]=queue[j];
						queue[j]=t;
					}
				}
			}
			temp=Math.abs(queue[1]-head);
			for(int j=1;j<num;j++)
			{
				temp=temp+Math.abs(queue[j]-queue[j-1]);
			}
		return temp;
	}
}
