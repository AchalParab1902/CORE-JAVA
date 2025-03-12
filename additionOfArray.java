import java.util.*;
public class additionOfArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter a number of rows: ");
        int col=sc.nextInt();
        int arr1[][]=new int[row][col];
        int arr2[][]=new int[row][col];
        System.out.println("Enter tha vales of First array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter tha vales of Second array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("First Array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(arr1[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Second Array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(arr2[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("addition of array is : ");
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(arr1[i][j]+arr2[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }
}