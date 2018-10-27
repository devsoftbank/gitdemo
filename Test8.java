package com.hai.chap01;
//for语句与switch语句使用场景
//这个例子如果使用for语句则count这个值不会返回
//for语句会随着循环体的结束循环变量也会结束
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
