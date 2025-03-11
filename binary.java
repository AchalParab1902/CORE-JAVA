import java.util.*;
class binary
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={3,6,8,9,10,16};
		int high=5;
		int low=0;
		int flag=0;
		System.out.println("Enter a key");
		int key=sc.nextInt();
		while(low<=high){
			int mid=(high+low)/2;
			if(key==arr[mid]){
				flag++;
				
				break;
			}
			else if(arr[mid]>key){
				high=mid-1;
			}
			else if(arr[mid]<key){
				low=mid+1;
			}
		}
		if(flag==1){
			System.out.println("Key found");
		}
		else{
		System.out.println("not found");
		}
	}
}
