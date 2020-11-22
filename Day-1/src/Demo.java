import java.util.Scanner;
public class Demo {
	public static void main(String args[])
	{
		int m1,m2,m3;
        
        float total=0, per;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of Subject");
           m1 = sc.nextInt();
           m2 = sc.nextInt();
           m3 = sc.nextInt();
           total = total+m1+m2+m3;
           per=(total/300)*100;
        
        
        System.out.print("The student Grade is: ");
        if(per>=80)
        {
            System.out.print("A that is first class");
        }
        else if(per>=60 && per<80)
        {
           System.out.print("B that is second class");
        } 
        else if(per>=40 && per<60)
        {
            System.out.print("C that is third class");
        }
        else
        {
            System.out.print("D that is fail");
        }
    }
	}


