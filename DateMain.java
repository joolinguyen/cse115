package Day8;

public class DateMain {

	public static void main(String[] args) {
		
		DateInterface date0 = new DateInterface(25,7,2016);
		date0.addDays(3);
		
		DateInterface date1 = new DateInterface(25,7,2016);
		date1.addDays(30);
		
		DateInterface date2 = new DateInterface(25,7,2016);
		date2.addDays(300);
		
		DateInterface date3 = new DateInterface(25,7,2016);
		date3.addDays(900);
		
		DateInterface date4 = new DateInterface(25,7,2016);
		date4.subDays(5);
		
		DateInterface date5 = new DateInterface(25,7,2016);
		date5.subDays(50);
		
		DateInterface date6 = new DateInterface(25,7,2016);
		date6.subDays(500);
	}
}
