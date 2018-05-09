import java.util.Random;
import java.util.Scanner;
public class lruRandom {
	public static int lru(int n,int Frames,int Pages[],int table[][]){
		Random random = new Random();
		int kk=1;
		int i,j,pointer=1,Faults,flag,flag1=1,l,m;

		int Memory[]    = new int[10];
		int PageFault[] = new int[21];
		int Check[]     = new int[10];

		Faults = 1;
		for(i=1;i<=n;i++){

			System.out.printf("%d ",Pages[i]);
		}
		System.out.println("\n");
		
		for(i=1;i<=Frames;i++){
			Memory[i] = -1;
		}
		pointer = 1;
		Memory[1] = Pages[1];
		for(j=1;j<=Frames;j++){
			System.out.printf("%d ",Memory[j]);
			table[kk][j]=Memory[j];
		}
		kk++;
		System.out.println("\n");
		for(i=2;i<=n;i++){
			flag1 = 1;
			flag = 0;
			for(j=1;j<=Frames;j++){
				if(Pages[i]==Memory[j]){
					flag = 1;
					break;
				}
			}
			if(flag == 1){
				PageFault[i] = 1;
				//Do nothing.
			}
			else{
				flag1 = 0;
				for(j=1;j<=Frames;j++){
					if(Memory[j] == -1){
						flag1 = 1;
						break;
					}
				}
				if(flag1==1){
					Memory[j] = Pages[i];
					Faults = Faults + 1;
					PageFault[i] = 0;
				}
			}
			if(flag1==0){
				for(l=1;l<=Frames;l++){
					Check[l] = 0;
				}
				int k,count=0,exit=1;
				int count1=0;
				for(k=i-1;k>=1;k--){
					for(l=1;l<=Frames;l++){
						if(Pages[k] == Memory[l]){
							Check[l] = 1;
							count++;
						}
						if(count>=Frames-1){
							count1=0;
							for(m=1;m<=Frames;m++){
								count1 = count1 + Check[m];
							}
						}
						if(count1 == Frames-1){
							for(m=1;m<=Frames;m++){
								if(Check[m]==0){
									Memory[m] = Pages[i];
									exit=0;
									break;
								}
							}
						}
						if(exit==0){
							break;
						}
					}
					if(exit==0){
						break;
					}
				}
				Faults = Faults + 1;
			}
			for(j=1;j<=Frames;j++){
				System.out.printf("%d ",Memory[j]);
				table[kk][j]=Memory[j];
			}
			kk++;
			System.out.println("\n");
		}
		System.out.println(Faults);
		for(j=1;j<=n;j++){
			System.out.printf("%d ",PageFault[j]);
		}
		System.out.println("\n");
		return Faults;
	}
}