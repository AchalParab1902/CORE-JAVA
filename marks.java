import java.util.*;
class marks
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("Enter your roll no: ");
		int roll=sc.nextInt();
		System.out.println("Enter your marlks: ");
		float sub1=sc.nextFloat();
		float sub2=sc.nextFloat();
		float sub3=sc.nextFloat();
		float sub4=sc.nextFloat();
		
		float per=((sub1+sub2+sub3+sub4)/400)*100;
		
		System.out.println("------------------------------------------------------");
		System.out.println("MarkList");
		System.out.println("Roll No: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Percentage: "+per);
		System.out.println("------------------------------------------------------");
		
	}
	
}