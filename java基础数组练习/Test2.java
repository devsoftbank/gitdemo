package com.hai.chap01;

import java.util.Scanner;

public class Test2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入星期(1-7)");
		int week = sc.nextInt();
		printWeek(week);
		sc.close();
	}
	public static void printWeek(int week){
		if(week<1||week>7){
		System.out.println("你输入的星期有误");
		return;
		}
		String[] weeks = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		System.out.println("你要查找的是"+weeks[week-1]);
	}
}
