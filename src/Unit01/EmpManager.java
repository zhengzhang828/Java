package Unit01;

public class EmpManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp emp = new Emp();
		emp.Name = "Jason";
		emp.Age = 25;
		emp.Gender = 'M';
		emp.Salary = 6000.00;
		
		emp.printInfo();
		
		emp.Salary = emp.Salary * 1.25;
		emp.printInfo();
		
	}

}
