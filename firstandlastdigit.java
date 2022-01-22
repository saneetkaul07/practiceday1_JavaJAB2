import java.util.*;
public class firstandlastdigit {
public static void main (String args []) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the nummber : ");
	 int n=sc.nextInt();
	 
	 System.out.println("thE First DIGIT WOULD BE :"+firstdigit(n));
	 System.out.println("thE Last DIGIT WOULD BE :"+lastdigit(n));
	 
}
	 public static int firstdigit(int n) {
		 
	 while(n>=10) {
		 n=n/10;
		
	 }
	 return n;
	
	 }
	 
	 public static int lastdigit(int n) {
	 n=n%10;
	 return n;
	 }
	 
}

