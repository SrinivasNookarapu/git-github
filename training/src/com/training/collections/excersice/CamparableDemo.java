package com.training.collections.excersice;

import java.util.ArrayList;
import java.util.Collections;

class Employ implements Comparable<Employ>{
	int emp_id;
	String emp_name;
	
	
	public Employ() {
		super();
	}


	public Employ(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


//	@Override
//	public int compareTo(Object o) {
//		Employ e = (Employ) o;
//		
//		return this.emp_id - e.emp_id;
//	}
	
//	@Override
//	public int compareTo(Object o) {
//		Employ e = (Employ) o;
//		
//		return emp_name.compareTo(e.emp_name);
//	}


	@Override
	public int compareTo(Employ o) {
		Employ e = (Employ) o;
		return emp_name.compareTo(e.emp_name);
	}
	
	
	
	
}

public class CamparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Employ> al = new ArrayList<>();
		al.add(new Employ(10, "Srinu"));
		al.add(new Employ(5, "harish"));
		al.add(new Employ(4, "Yetu"));
		al.add(new Employ(3, "anusha"));
		al.add(new Employ(2, "ramesh"));
		al.add(new Employ(1, "sai"));
		System.out.println("before sorting");
		al.forEach(x -> System.out.println(x.getEmp_id()+" = "+x.getEmp_name()));
		
		Collections.sort(al );
		System.out.println("After sorting");
		al.forEach(x -> System.out.println(x.getEmp_id()+" = "+x.getEmp_name()));
		

	}

}
