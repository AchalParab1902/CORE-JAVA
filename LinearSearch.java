import java.util.*;
import java.util.stream.IntStream;
class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={10,20,30,40,50};
		System.out.println("Enter a key");
		int key=sc.nextInt();
	//	int flag=0;
	//	for(int x:arr){
	//		if(key==x){
	//		flag++;
	//		break;
	//	}
	//	}
	//	if(flag==1){
	//		System.out.println("key found");
	//}
	//else{
	//	System.out.println("Key not found");
	//}
	
	
	boolean res=IntStream.of(arr).anyMatch(x->x==key);
	System.out.println(res?"Key found":"key not found");
	
}
}
