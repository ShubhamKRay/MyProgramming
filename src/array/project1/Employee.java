package array.project1;
/*
 * 
*13.Store 10 employees in an array (with details name, id, age and salary) and now,
a)access all the employees.
b)print and count all employee with age <30 years.
c)print the details of employee with highest and least salary.
d)Search whether an employ is available or not by id.
e)Search whether an employ is available or not by name.
f)Count and print all the employee whose salary is more than average salary.

 */
public class Employee {
	int id;
	String name;
	int age;
	double salary;
	
	Employee(int id,String name, int age, double salary){
		
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void display() {
	        System.out.println(id + "  " + name + "  " + age + "  " + salary);
	    }
	
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	    public static void main(String[] args) {

	        // Store 10 employees in array
	        Employee[] emp = new Employee[10];

	        emp[0] = new Employee(101, "Amit", 25, 25000);
	        emp[1] = new Employee(102, "Ravi", 32, 35000);
	        emp[2] = new Employee(103, "Neha", 28, 40000);
	        emp[3] = new Employee(104, "Suman", 45, 55000);
	        emp[4] = new Employee(105, "Anil", 29, 30000);
	        emp[5] = new Employee(106, "Kiran", 34, 45000);
	        emp[6] = new Employee(107, "Pooja", 26, 28000);
	        emp[7] = new Employee(108, "Rahul", 38, 60000);
	        emp[8] = new Employee(109, "Sneha", 24, 22000);
	        emp[9] = new Employee(110, "Vikas", 41, 50000);

	        // a) Access all employees
	        System.out.println("a) All Employees:");
	        for (Employee e : emp) {
	            e.display();
	        }

	        // b) Print and count employees with age < 30
	        int ageCount = 0;
	        System.out.println("\nb) Employees with age < 30:");
	        for (Employee e : emp) {
	            if (e.age < 30) {
	                e.display();
	                ageCount++;
	            }
	        }
	        System.out.println("Count: " + ageCount);

	        // c) Employee with highest and least salary
	        Employee maxSal = emp[0];
	        Employee minSal = emp[0];

	        for (Employee e : emp) {
	            if (e.salary > maxSal.salary)
	                maxSal = e;
	            if (e.salary < minSal.salary)
	                minSal = e;
	        }

	        System.out.println("\nc) Employee with Highest Salary:");
	        maxSal.display();

	        System.out.println("Employee with Lowest Salary:");
	        minSal.display();

	        // d) Search employee by id
	        int searchId = 105;
	        boolean foundId = false;

	        for (Employee e : emp) {
	            if (e.id == searchId) {
	                System.out.println("\nd) Employee found with ID " + searchId + ":");
	                e.display();
	                foundId = true;
	                break;
	            }
	        }
	        if (!foundId) {
	            System.out.println("\nd) Employee not found with ID " + searchId);
	        }

	        // e) Search employee by name
	        String searchName = "Pooja";
	        boolean foundName = false;

	        for (Employee e : emp) {
	            if (e.name.equalsIgnoreCase(searchName)) {
	                System.out.println("\ne) Employee found with name " + searchName + ":");
	                e.display();
	                foundName = true;
	                break;
	            }
	        }
	        if (!foundName) {
	            System.out.println("\ne) Employee not found with name " + searchName);
	        }

	        // f) Employees with salary more than average salary
	        double sum = 0;
	        for (Employee e : emp) {
	            sum += e.salary;
	        }

	        double avgSalary = sum / emp.length;

	        int countAboveAvg = 0;
	        System.out.println("\nf) Employees with salary greater than average (" + avgSalary + "):");

	        for (Employee e : emp) {
	            if (e.salary > avgSalary) {
	                e.display();
	                countAboveAvg++;
	            }
	        }

	        System.out.println("Count: " + countAboveAvg);
	    }
	}


