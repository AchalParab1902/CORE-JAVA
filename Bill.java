import java.util.*;
class Bill 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int pid,qty;
		String pname;
		float price,total;
		
		
		float discount=0f,discountamt=0f;
		for(int i=0;i<1;i++){
			System.out.println("Enter pid");
			pid=sc.nextInt();
			System.out.println("Enter pname");
			pname=sc.next();
			System.out.println("Enter price");
			price=sc.nextFloat();
			System.out.println("enter qty");
			qty=sc.nextInt();
			
			total=(price*qty);
			if(total>10000){
				discount=10f;
				discountamt=total*0.1f;
			}
			else if(total>8000){
				discount=8f;
				discountamt=total*0.08f;
			}
			else if(total>6000){
				discount=6f;
				discountamt=total*0.06f;
			}
			else{
				discount=0f;
			}
			System.out.println("===========BILL==========");
			System.out.println("PRODUCT ID = "+pid);
			System.out.println("PRODUCT NAME = "+pname);
			System.out.println("PRODUCT PRICE = "+price);
			System.out.println("PRODUCT QTY = "+qty);
			System.out.println("TOTAL PRICE = "+total);
			System.out.println("DISCOUNT IS = "+discount+"%");
			System.out.println("AMOUNT TO PAY = "+(total-discountamt));
			System.out.println("=========THANK YOU==============");
		}
		
		
		
	}
}
