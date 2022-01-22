//Saneet Kaul//

import java.util.*;
public class fibonacci {
	public static void main(String args[]) {
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Enter the first number : ");
	int a= sc.nextInt();
	
	System.out.println("Enter the second number : ");
	int b= sc.nextInt();
	
	int n=10;
	
	for(int i=0;i<n;i++) {
		
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}
}
}
