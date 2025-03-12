import java.util.*;
public class twoArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter a number of rows: ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter tha vales of array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}