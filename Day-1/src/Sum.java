import java.util.Scanner;
public class Sum {
	public static void main(String args[])
	{
		int n;//586
		int sum =0,rem,rev=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a three digit number");
		 n = sc.nextInt();
		if(n%2==0)
		{
			while(n > 0)
	        {
	            rem = n % 10;
	            sum = sum + rem;
	            n = n / 10;
	        }
			System.out.print("sum of digits:"+sum);
		}
		else
		{
			 while(n != 0) {
		            rem= n % 10;
		            rev = rev * 10 + rem;
		            n /= 10;
		            sum=sum+rem;
			 }
		}
			 System.out.print("sum of digits:"+sum); 
	
	}
}


