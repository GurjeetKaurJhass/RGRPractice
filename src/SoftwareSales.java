
public class SoftwareSales {

	public double calculateQuantity(int q)
	{

		
		double subTotal= 99.0*q;
        double discount=0.0;
        if (q >= 10 && q <= 19) {

			discount = subTotal * 0.20;
		}
		
		double finalTotal = subTotal - discount;
		return finalTotal;
		
	}
	

		
	}
	
	

