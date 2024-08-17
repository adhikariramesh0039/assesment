package assesment;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

System.out.println("enter num 1");
int num1=scan.nextInt();

System.out.println("enter num 2");
int num2=scan.nextInt();

int sum=num1+num2;
System.out.println(" sum = "  +sum);

int product=num1*num2;
System.out.println(" product = " +product);

int diff=num1-num2;
System.out.println(" difference = " +diff);

int div=num1/num2;
System.out.println(" division = " +div);

	}

}
