
public class EvenO {

	
	public boolean isEven(int n) {
		
		
			if (n <= 0) {
				// if n < 0, exit function
				return false;
			}
			else {
				// otherwise, calculate even // odd
				if (n % 2 == 0) {
					return true;
				}
				else {
					return false;
				}
			}

}
	
}