package assignments;

public class EmpGroups extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpGroups empg= new EmpGroups();
		String [] empgrp1 = new String[4];
		int [] empgrp2 =new int[4];
		empgrp1 [0]=empg.empName1;
		empgrp2 [0]=empg.empId1;
		empgrp1 [1]=empg.empName2;
		empgrp2 [1]=empg.empId2;
		empgrp1 [2]=empg.empName3;
		empgrp2 [2]=empg.empId3;
		empgrp1 [3]=empg.empName4;
		empgrp2 [3]=empg.empId4;
				
		System.out.println("Employee Name:"+ empgrp1[0]);
		System.out.println("Employee Id:"+ empgrp2[0]);
		System.out.println("Employee Name:"+ empgrp1[1]);
		System.out.println("Employee Id:"+ empgrp2[1]);
		System.out.println("Employee Name:"+ empgrp1[2]);
		System.out.println("Employee Id:"+ empgrp2[2]);
		System.out.println("Employee Name:"+ empgrp1[3]);
		System.out.println("Employee Id:"+ empgrp2[3]);

		

	}

}
