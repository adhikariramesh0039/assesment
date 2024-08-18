package assesment;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int number=sc.nextInt();

int fact=1;
int x=1;
do {fact=fact*x; x++;
}
while(x<=number);
System.out.println(+fact);
}

//this line was written in develop branch.
	}


