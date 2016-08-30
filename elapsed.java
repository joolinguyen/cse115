package Day8;

public interface elapsed {
	

	public static final int DAYS_WEEK  = 7;
	public static final int WEEKS_YEAR = 52;
	
	//add any number of days to a date
	public abstract void addDays(int d);
	
	//subtract any number of days from a date
	public abstract void subDays (int d);

}
