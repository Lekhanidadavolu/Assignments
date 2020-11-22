import java.util.Scanner;
public class Ope {
  public static void main(String[] args) {
   
    int a, b,c;
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter numbers");
	 a = sc.nextInt();
	 b=sc.nextInt();
	 //Arithmetic operators
    System.out.println("a + b = " + (a + b));// addition operator
    System.out.println("a - b = " + (a - b));// subtraction operator
    System.out.println("a * b = " + (a * b));// multiplication operator
    System.out.println("a / b = " + (a / b));// division operator
    System.out.println("a % b = " + (a % b));// modulo operator
    //assignment operators
    int var;
    var = a;
    System.out.println("var using =: " + var);// assign value using =
    var += a;
    System.out.println("var using +=: " + var);// assign value using =+
    var *= a;
    System.out.println("var using *=: " + var);// assign value using =*
    //relational operators
    System.out.println("a is " + a + " and b is " + b);// value of a and b
    System.out.println(a == b);  // false// == operator
    System.out.println(a != b);  // true// != operator
    System.out.println(a > b);  // false // > operator
    System.out.println(a < b);  // true// < operator
    System.out.println(a >= b);  // false// >= operator
    System.out.println(a <= b);  // true// <= operator
    //increment or decrement
    System.out.println("After increment:"+(++b));
    System.out.println("After increment:"+(a++));
    System.out.println("After decrement:"+(b--));
    System.out.println("After increment:"+(--a));
    //bitwise operators
    c = a & b;        
    System.out.println("a & b = " + c );//bitwise and
    c = a | b;        
    System.out.println("a | b = " + c );//bitwise or
    c = a ^ b;        
    System.out.println("a ^ b = " + c );//bitwise xor
    c = ~a;           
    System.out.println("~a = " + c );//bitwise compliment
    c = a << 2;       
    System.out.println("a << 2 = " + c );//left shift
    c = a >> 2;       
    System.out.println("a >> 2  = " + c );//right shift
    //conditional operators
    b = (a == 1) ? 5: 8;
    System.out.println("Value of b is: " + b);
    //logical operators
    System.out.println(a > 3 && a < 10);//logical and
    System.out.println(b > 3 || b < 10);//logical or
    System.out.println(!(a > 3 && a < 10));//logical not
  }
}