package Day9;

public class ccValidate {

	String cardno;
	
	public ccValidate( String number){
		cardno = number;
	}
	
	public static Boolean isValidLength(String number){
	
		if ( (number.length() >= 13) && (number.length() <= 16)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static Boolean isValidIssuer(String number){
		if ( (number.charAt(0) == 4) || (number.charAt(0) == 5) || (number.charAt(0) == 6)){
			return true;
		}
		if( (number.charAt(0) == 3) && (number.charAt(1) == 7) ){
			return true;
		}
		else{
			return false;
		}
	}
	
	 
}
