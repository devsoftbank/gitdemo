package com.hai.chap01;

import java.util.Scanner;

public class Test2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����������(1-7)");
		int week = sc.nextInt();
		printWeek(week);
		sc.close();
	}
	public static void printWeek(int week){
		if(week<1||week>7){
		System.out.println("���������������");
		return;
		}
		String[] weeks = {"����һ","���ڶ�","������","������","������","������","������"};
		System.out.println("��Ҫ���ҵ���"+weeks[week-1]);
	}
}
