package assesment;

import java.util.Scanner;

public class calculatorswitch {

			public static void main(String[] args) {
				
				Scanner scan=new Scanner(System.in);

				
			    System.out.println("enter num 1");
				int num1=scan.nextInt();
				
				System.out.println("enter num 2");
				int num2=scan.nextInt();
				
				System.out.println(" 1 for add\n 2 for product\n 3 for difference\n 4 for division ");

				int x = scan.nextInt();			

	
		switch (x) {
				case 1:
					int sum=num1+num2;
					System.out.println(" sum = "  +sum);
				
					
				break;
				case 2:
					int product=num1*num2;
					System.out.println(" product = " +product);
					
				break;
				case 3:
					int diff=num1-num2;
					System.out.println(" difference = " +diff);
					
				break;
				case 4:
					int div=num1/num2;
					System.out.println(" division = " +div);
					
				break;
				default:
					break;
			
				}
					}}

				

			

	


