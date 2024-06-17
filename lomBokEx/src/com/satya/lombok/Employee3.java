package com.satya.lombok;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Employee3 {
	private int empId;
	private String empName;
	private double empSalary;
	
}
