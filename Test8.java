package com.hai.chap01;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=0;
		int count=0;
		while((money=count*5)<1024){
			count++;
		}
		if(money>1024){
			count--;
			money=count*5;
		}
		System.out.println("一共需要"+count+"可以攒够"+money);
	}
}
