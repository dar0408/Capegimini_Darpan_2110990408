
//W.A.P to check if student is pass or fail basis of user input:-

import java.util.Scanner;
public class passFail{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(num <= 40){
		System.out.println("Fail");
		}
	else if(num <= 75){
		System.out.println("Pass");
		}
	else{
		System.out.println("Destination");
		}
	}
}