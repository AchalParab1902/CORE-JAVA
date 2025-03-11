import java.util.*;

class maxmin 
{
	public static void main(String[] args) 
	{
	
		int arr[]={36,78,54,32,89};
		//int max=arr[0];
		//int min=arr[0];
		//for(int x:arr){
		//	if(x>max){
		//		max=x;
		//	}
			
		//	if(x<min){
		//		min=x;
		//	}
		//}
		
		int max=Arrays.stream(arr).max().getAsInt();
		int min=Arrays.stream(arr).min().getAsInt();
		System.out.println("max number is "+max);
		System.out.println("min number is "+min);
		
		
		
	}
}
