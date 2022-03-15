
public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(int m,int y, int d) {
		month=m;
		year=y;
		day=d;
	}

	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public int getDay() {
		return day;
	}
	public void setMonth( int m) {
		month=m;
	}
	public void setYear(int y) {
		year=y;
	}
	public void setDay(int d) {
		day=d;
	}
	
	public void displayDate() {
		System.out.println(day+"/"+month+"/"+year);
	}
}
