public class Sum_of_Squares {						//class method-->method name sum of squares`
//	static int squares(int n){					//method type-->with parameter with return value
//		int sum = 0;						//Data type and varible name and its value 
//		for (int i=1;i<=n;i++)					//using for loop is it no of value rotation 
//		sum += (i*i);						//sum of i value
//		return sum;						//return value
//	}
	static int squares(int n){					//method type-->with parameter with return value
		return (n*(n+1)*(2*n+1))/6;				//return value equation-->(n*(n+1)*(2*n+1))/6
	}
	
	public static void main(String[] args) {			//main method 
		int n=6;						//datatype and delcare varible 
		System.out.print("Sum of Square is: "+squares(n));	//output of method type
	}
}