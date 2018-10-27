/*
 * java选择结构  
 * 
 * 
 * 
 */
package com.hai.chap01;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean bb = true;
		while(bb){
			System.out.println("请输入月份");
			int month = sc.nextInt();
			if(month>=3&&month<=5){
				System.out.println("春季");
			}else if(month>=6&&month<=9)
			{
				System.out.println("夏季");
			}else if(month>=10&&month<=11)
			{
				System.out.println("秋季");
			}else if(month==12||month==1||month==2){
				System.out.println("冬季");
			}else{
				System.out.println("你输入的月份有误");
			}
		}
	}

}
