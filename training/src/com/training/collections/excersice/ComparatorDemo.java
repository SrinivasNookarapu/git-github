package com.training.collections.excersice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student12{
	int sid;
	String sname;
	public Student12(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}

class Mycomparator implements Comparator<Student12>{

	@Override
	public int compare(Student12 o1, Student12 o2) {
		
		return (o1.sname).compareTo(o2.sname);
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Student12> al = new ArrayList<>();
		al.add(new Student12(10, "vasu"));
		al.add(new Student12(5, "harish"));
		al.add(new Student12(3, "anusha"));
		al.add(new Student12(2, "anu"));
		al.add(new Student12(1, "zak"));
		System.out.println("before sorting");
		al.forEach(x -> System.out.println(x.getSid()+" = "+x.getSname()));
		
		// Java 8 Feature
		
		Collections.sort(al, new Mycomparator() );
		System.out.println("After sorting");
		//al.forEach(x -> System.out.println(x.getSid()+" = "+x.getSname()));
		Iterator<Student12> itr = al.iterator();
		while(itr.hasNext()) {
			Student12 s = itr.next();
			System.out.println(s.sid+" "+s.sname);
		}

	}

}
