package assesment;

import java.util.Scanner;

public class minimumofnumbers {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);

System.out.println("enter num 1");
int num1=scan.nextInt();

System.out.println("enter num 2");
int num2=scan.nextInt();


System.out.println("enter num 3");
int num3=scan.nextInt();


if(num1<num2 && num1<num3) {
	System.out.println("num 1 is smallest");}
	
	else if(num2<num1 && num2<num3) {
		System.out.println("num 2 is smallest");}
		
		else  {
			System.out.println("num 3 is smallest");
		}
	}
	}
	

