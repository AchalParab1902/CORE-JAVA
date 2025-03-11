import java.util.*;
public class ArrayMethod2{
static Scanner sc=new Scanner(System.in);

    public static int linearSearch(int flag,int arr[]){
        System.out.println("Enter a key : ");
                int key=sc.nextInt();
                // int flag=0;

                for(int x:arr){
                    if(key==x){
                        flag=1;
                        break;
                    }
                }
                return flag;

                
    }

    public static int binarySearch(int n,int arr[]){

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
               return flag;
    }

    public static int max(int arr[]){
                int max=arr[0];
                for(int x:arr){
                    if(max<x){
                        max=x;
                    }
                }
                return max;
               

    }

    public static int min(int arr[]){
            int min=arr[0];
                for(int x:arr){
                    if(min>x){
                        min=x;
                    }
                }
                return min;

    }

    public static float avg(int arr[]){
        int sum=0;
                int len=arr.length;
                for(int x:arr){
                    sum=sum+x;
                }
                float avg=sum/len;
                return avg;


    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of n :");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter number of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

       
          int flag=0;
        boolean bool=true;
        do{
            System.out.println("=========================================================================");
        System.out.println("1.Linear Search\n2.Binary Search\n3.Max\n4.Min\n5.Average\n");
        
        System.out.println("=========================================================================");
        System.out.println("Enter a choice : ");
        int num=sc.nextInt();



        switch(num){
            case 1:{
                // Linear Search
              int a=linearSearch(flag,arr);
                
               if(a==1){
                System.out.println("Key Found....");
                }
                else{
                System.out.println("Key not found....");
                }

                break;
            }

            case 2:{
                //Binary Search
              int a=binarySearch(n,arr);
               if(a==1)
                System.out.println("Key Found...");
                else
                System.out.println("Key not Found...");
                break;
            }

            case 3:{
                //max
                int a=max(arr);
                 System.out.println("Maximum number is : "+a);
                break;
            }
            case 4:{
                //min
                int a=min(arr);
                System.out.println("Minimum number is : "+a);
                break;
            }
            case 5:{
                //average
                float a=avg(arr);
                System.out.println("Average number is : "+a);
                break;
            }
            default:{
                System.out.println("Invalid choice : ");
                break;
            }
        }
        System.out.println("===============================================================================================");
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