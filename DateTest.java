import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
Date myDate=new Date(3,3,2022);

System.out.println("enter day");
int d=in.nextInt();
myDate.setDay(d);

System.out.println("enter month");
int m=in.nextInt();
myDate.setMonth(m);

System.out.println("enter year");
int y =in.nextInt();
myDate.setYear(y);

myDate.displayDate();
	}

}
