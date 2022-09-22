package com.inheritance.pill;

import com.inheritance.bill.HourlyEmployee;
import com.inheritance.bill.SalaryEmployee;

public class TestEmployee {
	public static void main(String[] args) {
		SalaryEmployee s1 =new SalaryEmployee("Vivek", "Developer",35000);
		
		HourlyEmployee h1=new HourlyEmployee("Varun","Accountent",500,7);
		
		System.out.println(s1);
		System.out.println(h1);

	}

}

