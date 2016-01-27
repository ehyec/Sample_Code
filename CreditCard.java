/**
 * Eunhye Choi
 * For application only
 * To check whether the credit card number is valid or not 
 */


public class CreditCard {
		/*constructor*/
		/*instance variables*/
		private String creditCardNumber;
		private int first4;
		private int last4;
		private int sum; 
		private int errorCode;
		private boolean isValid;

	// constructor method
	public CreditCard (String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
		this.first4 = Integer.parseInt(creditCardNumber.substring(0,3));
		this.last4 = Integer.parseInt(creditCardNumber.substring(8,11));
		
		
		this.sum = 0;
		this.errorCode = 0;
		this.isValid = true;
	}
	
	
	public void check () {
			int [] num = new int [12];	//input 12 digit numbers
		
			
			//set sum and num
			for (int i = 0; i < num.length; i++)
			{
				num [i] = Integer.parseInt(creditCardNumber.substring(i, i+1));
				sum += Integer.parseInt(creditCardNumber.substring(i, i + 1));
			}
			
		
			//six rules to verify the card number
			if (num[0] != 4) {
				errorCode = 1;
			}
			else if (num[3] <= num[4]) {
				errorCode = 2;
			} 
			else if (num[0] * num[4] * num[8] != 24) {
				errorCode = 3;
			}
			else if ((sum % 4) != 0) {
				errorCode = 4;
			}
			else if ((sum = sum + first4) >= (sum = sum + last4)) {
				errorCode = 5;
			}
			else if (((num[0]*10 + num[1]) + (num[6]*10 + num[7])) != 100) {
				errorCode = 6;
			}
			
	}
	
	public boolean isValid() {
			if(errorCode == 0)
			{
				return true;
			}
			else
			{
				return false; //shows the first test errorCode number
			}
	}
	
	
	public int getErrorCode() {
		return errorCode;
	}	
}
