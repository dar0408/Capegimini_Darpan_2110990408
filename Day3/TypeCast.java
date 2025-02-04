//1. Convert an int to double
//Problem: Write a program to take an int input and convert it to a double //using widening casting.
//Expected Output:
//Input: 5
//Output: 5.0;

//	import java.util.Scanner;
//	public class TypeCast{
//		public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		double m = n;	
//		System.out.println(m);
//		}
//	}







//2. Convert a double to int
//Problem: Write a program to take a double input and convert it to an int //using narrowing casting.
//Expected Output:
//Input: 5.75
//Output: 5


//	import java.util.Scanner;
//	public class TypeCast{
//		public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		double n = sc.nextDouble();
//		int m = (int)n;
//		System.out.println(m);
//		}
//	}








//3. ASCII Conversion
//Problem: Write a program to input a character and display its ASCII value //(typecast char to int).
//Expected Output:
//Input: A
//Output: 65


//	import java.util.Scanner;
//	public class TypeCast{
//		public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		char ch = sc.next().charAt(0);
//		int n = (int)ch;
//		System.out.println(n);
//		}
//	}






//4. Add Two Numbers of Different Types
//Problem: Add an int and a double and display the result.
//Expected Output:
//Input: 10 (int) and 5.5 (double)
//Output: 15.5

//	import java.util.Scanner;
//	public class TypeCast{
//		public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		double m = sc.nextDouble();
//		double sum = (double)n + m;
//		System.out.println(sum);
//		}
//	}


//5. Truncate Decimal Places
//Problem: Write a program to take a float input and convert it to an int //by truncating the decimal places.
//Expected Output:
//Input: 12.9
//Output: 12

//	import java.util.Scanner;
//	public class TypeCast{
//		public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		float n = sc.nextFloat();
//		int m = (int)n;
//		System.out.println(m);
//		}
//	}





//6. String to int Conversion
//Problem: Convert a String representing a number to an int. Handle invalid //input using exception handling.
//Expected Output:
//Input: "123"
//Output: 123


// Using ParseInt and try catch :-

//	import java.util.Scanner;
//	public class TypeCast{
//		public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//			try{
//			int ans = Integer.parseInt(str);
//			System.out.println(ans);
//			}
//			catch(NumberFormatException e){
//			System.out.println("try with valid input");
//			}
//		}
//	}
