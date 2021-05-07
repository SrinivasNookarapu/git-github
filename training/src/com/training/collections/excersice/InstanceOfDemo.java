package com.training.collections.excersice;

import java.util.ArrayList;

class Employee1{
	int empNo;
	String ename;
	public Employee1(int empNo, String ename) {
		super();
		this.empNo = empNo;
		this.ename = ename;
	}
	
}

class Student11{
	int sId;
	String sName;
	public Student11(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Employee1(10, "Srinu"));
		al.add(new Employee1(11, "sai"));
		al.add(new Employee1(12, "ramesh"));
		
		al.add(new Student11(20, "harish"));
		al.add(new Student11(21, "yamani"));
		al.add(new Student11(22, "durga"));
		
		al.add("Srinivas");
		
		Object b[] = al.toArray();
		
		for (Object x : b) {
			if(x instanceof Employee) {
				Employee1 e = (Employee1) x;
				System.out.println("Employee Info");
				System.out.println(e.empNo+" "+e.ename);
			}
			if(x instanceof Student11) {
				Student11 s = (Student11) x;
				System.out.println("Student Info");
				System.out.println(s.sId+" "+s.sName);
			}
			
			if(x instanceof String) {
				String s = (String) x;
				System.out.println("Normal Obj  Info");
				System.out.println(s);
			}
			
		}
		

	}

}
