/*
 * 跳转语句continue的使用
 */
package com.hai.chap01;

public class Test15 {
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			if(i==3){
				//return;    //打印 1 2
				//break;      //打印1 2 over
				continue;    //打印1 2 4 5 6 7 8 9 over
			}
			System.out.println(i);
		}
		System.out.println("over");
	}
}
