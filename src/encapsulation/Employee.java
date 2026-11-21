package encapsulation;

public class Employee {
	private String employee_name;
	private String employee_type;
	private int employee_id;
	private String email;
	private String job_role;
	private char gender;
	private String department;
	private long phone_no;
	private String shift;
	private String city;
	private String address;
	private String employee_status;
	private double salary;
	private String dateofbirth;
	private String joing_date;

	public void setemployee_name(String name) {
		employee_name = name;
	}

	public String getemployee_name() {
		return employee_name;
	}

	public void setemployee_type(String type) {
		employee_type = type;
	}

	public String getemployee_type() {
		return employee_type;
	}

	public void setemployee_id(int id) {
		employee_id = id;
	}

	public int getemployee_id() {
		return employee_id;
	}

	public void setemail(String gmail) {
		email = gmail;
	}

	public String getemail() {
		return email;
	}

	public void setjob_role(String role) {
		job_role = role;

	}

	public String getjob_role() {
		return job_role;

	}

	public void setgender(char gen) {
		gender = gen;
	}

	public char getgender() {
		return gender;
	}

	public void setdepartment(String dept) {
		department = dept;
	}

	public String getdepartment() {
		return department;
	}

	public void setphone_no(long no) {
		phone_no = no;
	}

	public long getphone_no() {
		return phone_no;
	}

	public void setshift(String time) {
		shift = time;
	}

	public String getshift() {
		return shift;
	}

	public void setcity(String cit) {
		city = cit;
	}

	public String getcity() {
		return city;
	}

	public void setaddress(String add) {
		address = add;
	}

	public String getaddress() {
		return address;
	}

	public void setemployee_status(String status) {
		employee_status = status;
	}

	public String getemployee_status() {
		return employee_status;
	}

	public void setsalary(double sal) {
		salary = sal;
	}

	public double getsalary() {
		return salary;
	}

	public void setdateofbirth(String date) {
		dateofbirth = date;
	}

	public String getdateofbirth() {
		return dateofbirth;
	}

	public void setjoing_date(String join) {
		joing_date = join;
	}

	public String getjoing_date() {
		return joing_date;
	}
}
