import java.util.Scanner;

/*14)perfect no or not?    */
public class perfect14 {
	//Perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6, which is
	//the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
		//Scanner s = new Scanner(System.in);
		//System.out.print("Enter an integer:");
		//n = s.nextInt();
		n=7;
		
		for(int i = 1; i<n; i++)
		{
		if(n % i == 0)   
		 {
			System.out.println(i);
		sum = sum + i;
		 }
	    }
		System.out.println("Sum is:     "+sum);
		if(sum == n)
		{
		System.out.println("The number is Perfect");
		}
		else
		{
		System.out.println("The number is not Perfect");
		}    
		}
		

	

}
