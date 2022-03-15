/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class Employeee {

	/**
	 * @param args
	 */
	private String firstName;
	private String lastName;
	private double monthSalary;
	
	public Employeee() {
		firstName=null;
		lastName=null;
		monthSalary=0.0;
		
		
	
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public double getmonthSalary(){
		return monthSalary;
	}
	
	public void setfirstName(String first) {
		firstName=first;
	}
	public void setlastName(String last) {
		lastName=last;
	}
	public void setmonthSalary(double salary) {
		
		monthSalary=salary;
		}
	

}
