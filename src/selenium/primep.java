package selenium;

public class primep {

	public static void main(String[] args) {
		
		
		int a = 1763;		
		boolean isprime= true;
		
		for (int i=2; i<a; i++) {
			
			if (a%i==0) 
			{
				isprime=false;
				break;
			}
			
		}
			
		if (isprime) {
			System.out.println(a+" is prime number");
		}
		else {
			System.out.println(a+" is not prime number");
		}
		
		
	
	
	}	
	
}
