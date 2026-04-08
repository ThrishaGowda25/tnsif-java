package com.tnsif.scannerclassprogram;

public class Tax {
public void CalculateTax(Person p) {
	if(p.getIncome()<1500) {
		p.setTax(0);
	}
	else if(p.getIncome()<=1500&&p.getIncome()<50000) {
		p.setTax(5);
	}
	else {
		p.setTax(10);
}

}
}
