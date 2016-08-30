package Day8;

public class DateInterface implements elapsed {

	private int day, month, year;
	private boolean leap = checkLeap(year);
	
	public DateInterface (int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}

	public String toString(){
		String s = (month + "/" + day + "/" + "year");
		return s;
	}
	
	public int countDays(){
		int days = 0;
		//add days of months prior to current month
		for (int i = 1; i < month; i++){
			days = days + getDaysInMonth(i);
		}
		//add days of current month
		days = days + day;
		return days;
	}
	
	public boolean checkLeap(int year){
		boolean leap;
		if (year % 4 != 0){
			return leap = false;
		}
		else if (year % 100 != 0){
			return leap = true;
		}
		else if (year % 400 != 0){
			return leap = false;
		}
		else {
			return leap = true;
		}
	}
	
	public int getDaysInMonth(int month){
		
		boolean leap = checkLeap(year);
		
		int daysInMonth;

		if (month == 2) {
			if (leap == false){
		      daysInMonth = 28;
			}
			else{
				daysInMonth = 29;
			}
		}
		
		else {
		      daysInMonth = 31 - (month - 1) % 7 % 2;
		}
		
		return daysInMonth;
	}
	
	public int getDaysInYear (int year){
		boolean leap = checkLeap(year);
		int daysInYear;
		
		if (leap == false){
			daysInYear = 365;
		}
		else{
			daysInYear = 366;
		}
		
		return daysInYear;
	}
	
	public void addDays(int d) {
		
		//count current days in year
		int days = countDays();
		
		//adding out of year bound
		while ( d >= (getDaysInYear(year) - days) ){
			d = d - ((getDaysInYear(year) - days) + 1);
			days = 1;
			day = 1;
			month = 1;
			year = year + 1;
		}
		//adding out of month bound
		while ( d >= (getDaysInMonth(month) - day)){
			d = d - ((getDaysInMonth(month) - day) + 1);
			day = 1;
			month = month + 1;
		}
		
		if ( d <= (getDaysInMonth(month) - day)){
			day = day + d;
			d = 0;
		}
		
		System.out.println(month + "/" + day + "/" + year);
	}

	public void subDays(int d) {
		
		//count current days in year
		int days = countDays();
		
		//subtract crossing year boundary
		while ( d >= days){
			d = d - days;
			day = 31;
			month = 12;
			year = year - 1;
			days = getDaysInYear(year);
		}
		
		while ( d > day){
			d = d - day;
			month = month - 1;
			day = getDaysInMonth(month);
		}
		
		if ( d < day){
			day = day - d;
		}
		System.out.println(month + "/" + day + "/" + year);
	}
}

