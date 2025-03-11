import java.util.*;
public class ArrayMethod{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of n :");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter number of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

       

        boolean bool=true;
        do{
             System.out.println("1.Linear Search\n2.Binary Search\n3.Max\n4.Min\n5.Average\n");
        System.out.println("Enter a choice : ");
        int num=sc.nextInt();

        switch(num){
            case 1:{
                // Linear Search
                System.out.println("Enter a key : ");
                int key=sc.nextInt();
                int flag=0;

                for(int x:arr){
                    if(key==x){
                        flag=1;
                        break;
                    }
                }
                if(flag==1){
                System.out.println("Key Found....");
                }
                else{
                System.out.println("Key not found....");
                }
                break;
            }

            case 2:{
                //Binary Search
                int high=n-1;
                int low=0;
                int flag=0;
                 System.out.println("Enter a key : ");
                    int key=sc.nextInt();


                while(low<=high){
                    int mid=(high+low/2);
                   
                    
                    if(key==arr[mid]){
                        flag++;
                        break;

                    }
                    else if(key<arr[mid]){
                        high=mid-1;
                    }
                    else if(key>arr[mid]){
                        low=mid+1;
                    }
                }
                if(flag==1)
                System.out.println("Key Found...");
                else
                System.out.println("Key not Found...");
                break;
            }

            case 3:{
                //max
                int max=arr[0];
                for(int x:arr){
                    if(max<x){
                        max=x;
                    }
                }
                System.out.println("Maximum number is : "+max);
                break;
            }
            case 4:{
                //min
                int min=arr[0];
                for(int x:arr){
                    if(min>x){
                        min=x;
                    }
                }
                System.out.println("Minimum number is : "+min);
                break;
            }
            case 5:{
                //average
                int sum=0;
                int len=arr.length;
                for(int x:arr){
                    sum=sum+x;
                }
                int avg=sum/len;
                System.out.println("Average is : "+avg);
                break;
            }
            default:{
                System.out.println("Invalid choice : ");
                break;
            }
        }
         System.out.println("Do you want to continue :");
        System.out.println("1.yes \n 2.no");
        System.out.println("Enter a choice : ");
        int ch=sc.nextInt();
        switch(ch){
            case 1:{
                bool=true;
                break;
            }
            case 2:{
                bool=false;
                break;
            }
        }
        
        }while(bool);
       
    }
}