package com.abhiyukti.solution;

public class Multiple3And5 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ;i<1000;i++){
			if(i%3==0 || i%5 == 0){
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Sum of 3 and 5 below 1000 is "+sum);
	}
}
