package com.tnsif.scannerclassprogram;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the person name"):
		String name=sc.next()
		System.out.println("enter income");
	int income=sc.nextInt();
	Person pp=new Person();
	pp.setName(name);
	pp.setIncome(income);
	Tax t=new Tax();
	t.CalculateTax(pp);
	System.out.println("after tax calculation");
	System.out.println(pp);
}
}
