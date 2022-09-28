import java.util.Scanner;
public class Star_pattern{
	public static void main(String[] args){
	try (//Nested for loop(Right triangle)
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number ");
			int n=sc.nextInt();
			
			for(int i=1;i<=n;i++) {				//Row
				for(int j=1;j<=i;j++) {			//Columns
					System.out.print("* ");}		//Print *
				System.out.println();}			//New line
			System.out.println();
			
			//Right triangle Reverse
			for(int i=1;i<=n;i++) {				//Row
				for(int j=n;j>=i;j--) {			//Columns
					System.out.print("* ");}		//Print *
				System.out.println();}			//New line
			
			//Left triangle
			for(int x=0;x<n;x++){					//Row
				for(int y=2*(n-x);y>=0;y--) {		//Columns Space 
					System.out.print(" ");}
				for(int y=0;y<=x;y++) {				//Column for * print
					System.out.print("*"+" ");}
				System.out.println();}
			
			//pyramid star
			for(int a=0;a<n;a++){					//Row
				for(int b=n-a;b>1;b--) {			//Columns Space 
					System.out.print(" ");}
				for(int b=0;b<=a;b++) {				//Columns for * print
					System.out.print("* ");}
				System.out.println();}
			System.out.println();
			
			//Reverse pyramid
			for(int a=0;a<=n-1;a++){					//Row
				for(int b=0;b<=a;b++) {			//Columns Space 
					System.out.print(" ");}
				for(int b=0;b<=n-1-a;b++) {				//Columns for * print
					System.out.print("* ");}
				System.out.println();}
			System.out.println();
			
			//Diamond 
			for(int a=0;a<n;a++){					//Row
				for(int b=n-a;b>1;b--) {			//Columns Space 
					System.out.print(" ");}
				for(int b=0;b<=a;b++) {				//Columns for * print
					System.out.print("* ");}
				System.out.println();
			}
			for(int a=1;a<=n-1;a++){					//Row
				for(int b=0;b<=a-1;b++) {			//Columns Space 
					System.out.print(" ");}
				for(int b=0;b<=n-1-a;b++) {				//Columns for * print
					System.out.print("* ");}
				System.out.println();
			}
		}		
}} 