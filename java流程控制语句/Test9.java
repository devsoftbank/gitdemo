package com.hai.chap01;
/*
 * 需求 教室高度是4.8米，你有一张足够大的纸，纸张的厚度是0.012米，
 * 请问需要折叠多少次可以超过教室的高度
 */
public class Test9 {
	public static void main(String[] args){
		int count = 0;
		int number = 1;
		while((number*12)<4800){
			count++;
			number *=2;
		}
		System.out.println("一共经历"+count+"次");
		
		/*int count=0;
		for(;number*12<4800;count++){
			number *=2;
		}
		System.out.println("一共经历"+count+"次");	
		*/
	}
}
