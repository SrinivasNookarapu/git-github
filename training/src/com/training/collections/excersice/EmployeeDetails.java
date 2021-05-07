package com.training.collections.excersice;

import java.util.*;

public class EmployeeDetails {
	
	private Map<Integer, String> employeeIdNameMap;

	public EmployeeDetails() {

		employeeIdNameMap = new TreeMap<Integer, String>();
	}

	public EmployeeDetails(Map<Integer, String> employeeIdNameMap) {
		super();
		this.employeeIdNameMap = employeeIdNameMap;
	}
	
	

	public String getEmployeeName(int employeeId) {
		String str="";
		int count = 0;
		if(employeeIdNameMap == null || employeeIdNameMap.size() == 0) {
			return null;
		}
		
		else {
			if(employeeIdNameMap.containsKey(employeeId)) {
				str = employeeIdNameMap.get(employeeId);
			}
		}
		
		if(str.length() == 0) {
			return null;
		}
		else {
			return str;
		}
		
	}
	
	public Map<Integer, String> getEmployeeIdNameMap(){
		return employeeIdNameMap;
	}
	
	public void setEmployeeNameMap(Map<Integer, String> employeeIdNameMap) {
		this.employeeIdNameMap = employeeIdNameMap;
	}

}
