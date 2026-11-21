package encapsulation;

public class Emp_main {
public static void main(String[] args) {
	Employee emp = new Employee();
	emp.setemployee_name("vaishnavi");
	emp.setemployee_type("permanent");
	emp.setemployee_id(101);
	emp.setemail("shindevaishnavi@123");
	emp.setjob_role("java developer");
	emp.setgender('f');
	emp.setdepartment("IT");
	emp.setphone_no(7709747894l);
	emp.setshift("day");
	emp.setcity("pune");
	emp.setaddress("wakad,pune");
	emp.setemployee_status("active");
	emp.setsalary(45000.0);
	emp.setdateofbirth("08/05/2004");
	emp.setjoing_date("17-11-2026");
	
	System.out.println(emp.getemployee_name());
	System.out.println(emp.getemployee_type());
	System.out.println(emp.getemployee_id());
	System.out.println(emp.getemail());
	System.out.println(emp.getjob_role());
	System.out.println(emp.getgender());
	System.out.println(emp.getdepartment());
	System.out.println(emp.getphone_no());
	System.out.println(emp.getshift());
	System.out.println(emp.getcity());
	System.out.println(emp.getaddress());
	System.out.println(emp.getemployee_status());
	System.out.println(emp.getsalary());
	System.out.println(emp.getdateofbirth());
	System.out.println(emp.getjoing_date());
}
}
