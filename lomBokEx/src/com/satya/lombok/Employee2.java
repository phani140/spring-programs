package com.satya.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee2 {
	
	private int empId;
	private String empName;
	private double empSalary;
	

}
