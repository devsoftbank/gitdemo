package com.hai.chap01;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		int a = sc.nextInt();
		if(a<0){
			System.out.println("���������������,����������");
			sc.close();
			return;
		}
		System.out.println("������ڶ�����");
		int b = sc.nextInt();
		if(b<0){
			System.out.println("���������������,����������");
			sc.close();
			return;
		}
		sc.close();
		Demo d = new Demo();
		int sum = d.getSum(a, b);
		System.out.println("�������ĺ���"+sum);
	}

}
class Demo{
	public int getSum(int a,int b){
		return a+b;
	}
}