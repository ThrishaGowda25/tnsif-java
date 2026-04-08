package com.tnsif.scannerclassprogram;

public class ConExample {
	ConExample(){
		System.out.println("default con");
	}
	ConExample(int a,String b){
		System.out.println("2 para");
	}
	ConExample(int r){
		System.out.println("2 para");
	}
	ConExample(int s,int t,int d){
		System.out.println(" 3 para");
	}
	public static void main(String[] args) {
		ConExample c= new ConExample();
		ConExample c1= new ConExample(1,"thrisha");
		ConExample c2= new ConExample(5);
		ConExample c3= new ConExample(3,4,5);
		}
	}
