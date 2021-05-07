package com.training.collections.excersice;

import java.util.*;

class Employee {
    String employee_name;
    int employee_salary;
    String empployee_address;
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}
	public String getEmpployee_address() {
		return empployee_address;
	}
	public void setEmpployee_address(String empployee_address) {
		this.empployee_address = empployee_address;
	}
	
	
	public Employee(String employee_name, int employee_salary, String empployee_address) {
		super();
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
		this.empployee_address = empployee_address;
	}
	@Override
	public String toString() {
		return "Employee [employee_name=" + employee_name + ", employee_salary=" + employee_salary
				+ ", empployee_address=" + empployee_address + "]";
	} 

    
}

class EmployeeDetail {
    Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
    void menu() {
        String m = "menu program for map\n";
        m += "1. Add Employee Details. \n";
        m += "2. Remove Employee details.\n";
        m += "3. find Employee Details.\n";
        m += "4. List Of All Employees.\n";
        m += "5. Exit.\n";
        m += "enter your Choice.\n";
        System.out.println(m);
    }
    int num = 1;
    void addEmployee(Employee emp) {       
        employeeMap.put(num, emp);
        num++;

    }
    
    void removeEmployee(int empId) {
        employeeMap.remove(empId);
    }
    
    void findEmployee(int empId) {
        System.out.println(employeeMap.get(empId));
    }

    Map<Integer, Employee> employeeList() {
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            map.putAll(employeeMap);
        }
        return map;
    }
}
public class CollectionsMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDetail obj = new EmployeeDetail();
        int res;
        while (true) {
            obj.menu();
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter the employee details to add");
                obj.addEmployee(new Employee(sc.next(), sc.nextInt(), sc.next()));
                System.out.println("inserted Successfully");
                break;
            case 2:
                System.out.println("Enter the employee Id to Remove");
                obj.removeEmployee(sc.nextInt());
                System.out.println("Removed Successfully");
                break;
            case 3:
                System.out.println("Enter the employee Id to get");
                obj.findEmployee(sc.nextInt());
                break;
            case 4:
                Map<Integer, Employee> resultMap = obj.employeeList();
                if (resultMap == null) {
                    System.out.println("No employee Details");
                } else {
                    for (Map.Entry<Integer, Employee> entry : resultMap.entrySet()) {
                    	System.out.println("EmpId : " + entry.getKey() + " Employee Details: " + entry.getValue());
                    }
                }
                break;
            case 5:
                System.exit(0);
                break;
            default :
            	System.out.println("Invalid Option Try Again");
                	
            }
            

 

        }

 

    }

 

}
