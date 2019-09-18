
public class SoftwareSales {

	public double calculateQuantity(int q)
	{
		double subTotal= 99.0*q;
        double discount=0.0;
        if (q >= 10 && q <= 19) {

			discount = subTotal * 0.20;
		
		double finalTotal = subTotal - discount;
		return finalTotal;
        }
	
        else if (q >= 20 && q <= 49) {

    		discount = subTotal * 0.30;
    	    double finalTotal = subTotal - discount;
    		return finalTotal;
    		
    	    }
    		
	   else if (q >= 50 && q <= 99) {

		discount = subTotal * 0.40;
	    double finalTotal = subTotal - discount;
		return finalTotal;
		
	    }
		return 99.0*q;
	
	}}
	


