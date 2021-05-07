package com.training.collections.excersice;

import java.util.*;

class Employe{
	int eid;
	String ename;
	
	public Employe(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	public int hashCode() {
		return this.eid;
	}

	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + "]";
	}
	
	public boolean equals(Object obj) {
		Employe e = (Employe) obj;
		return this.eid == e.eid && this.ename.equals(e.ename);
		
	}
	
	
}

public class ImpInterviewQuation {

	public static void main(String[] args) {
		
		Set<Employe> set = new HashSet<Employe>();
		set.add(new Employe(10, "srinu"));
		set.add(new Employe(10, "srinu"));
		set.add(new Employe(11, "harish"));
		set.add(new Employe(11, "harish"));
		set.forEach(System.out::println);
		

	}

}
