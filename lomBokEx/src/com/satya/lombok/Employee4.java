package com.satya.lombok;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class Employee4 {
	
	private int empId;
	 @NonNull String empName;
	private double empSalary;
	

}
