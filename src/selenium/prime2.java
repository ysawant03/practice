package selenium;

public class prime2 {
public static void main(String[] args) {
	
	int a=1763;
	
	for (int i=2; i<a; i++) {
		
		if (a%i==0) 
		{
			System.out.println(a+" is not prime");
			break;
		}
		else {
			System.out.println(a+" is prime");
		}
		
		
		
		
}
}
}