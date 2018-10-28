/*
 * 跳转语句break与continue的综合练习
 * 
 */
package com.hai.chap01;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
			if(i%3==0){
				//break;   //打印两次中国
				//continue;   //打印七次中国
				//System.out.println("中国");//打印13次中国
				return;
			}
			System.out.println("中国");
		}
	}
}
