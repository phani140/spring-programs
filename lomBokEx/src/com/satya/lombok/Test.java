package com.satya.lombok;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(1, "ram", 20000.45);
		System.out.println(employee);
		
		
		Employee employee2=new Employee();
		employee2.setEmpId(101);
		employee2.setEmpName("Chinni");
		employee2.setEmpSalary(200000.67);
		System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getEmpSalary());
		
		
		
		//for Employee2 object
		Employee2 employee22=new Employee2(111, "chinnu", 400000.32);
		System.out.println(employee22);
		
		
		//for Employee3 object
		Employee3 employee3=new Employee3.Employee3Builder()
										.empId(101)
										.empName("name")
										.empSalary(20000.45)
										.build();
		System.out.println(employee3);
		
		//for employee4 object
		Employee4 employee4=new Employee4();
		employee4.setEmpId(234);
		employee4.setEmpName(null);
		employee4.setEmpSalary(300000.45);

		
		

	}

}
