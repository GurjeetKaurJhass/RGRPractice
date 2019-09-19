import static org.junit.Assert.assertEquals;

public class FizzBuzzWhizz {

	
	
	
	
	
	
	
	public String buzzz(int n)
	{
		
        if(n%3==0 && n%5==0)
        {
		return "fizzbuzz";
        }
		
		return null;
		
	
	
	}
	public boolean checkPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num-1; i++) {
			if (num % i == 0) {
				// number is NOT prime
				isPrime = false;
				break;
			}
		}
	
		
		return isPrime;
	}



	

}
	
