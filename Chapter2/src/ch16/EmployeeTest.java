package ch16;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̼���");
//		System.out.println(employeeLee.serialNum);
		System.out.println(employeeLee.getSerialNum());
		
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
//		System.out.println(Employee.serialNum);
		
		System.out.println(employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeId());
		
		
	}
}