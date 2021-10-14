//Factorial Program using Recursion
//Vinayak Mali

import java.util.Scanner;

public class FactorialProgramUsingRecursion {

    public static int Factorial(int n){
        if(n==1){
            return 1;
        }
        return n * Factorial(n-1);
    }

    public static void main(String[] args) {
        int n,factorial;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter number to calculate Factorial : ");
        n = input.nextInt();
        factorial = Factorial(n);
        System.out.println("Factorial of "+ n + " is " + factorial);
    }
    /*
    enter n value 
    10
    enter r value 
    8
    
    45
    */
    
    public class NcR {

	public static int factorial(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans=ans*i;
	}
	return ans;
	}

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value ");
			int n=s.nextInt();
		System.out.println("enter r value ");
			int r=s.nextInt();
		
    	int num= factorial(n);
		int deno1= factorial(r);
		int deno2= factorial(n-r);
		int ans=num/(deno1*deno2);
		System.out.println(ans);	
		}

	}
    
}
