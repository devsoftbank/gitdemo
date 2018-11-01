package com.hai.chap01;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		if(a<0){
			System.out.println("你输入的数字有误,请重新输入");
			sc.close();
			return;
		}
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		if(b<0){
			System.out.println("你输入的数字有误,请重新输入");
			sc.close();
			return;
		}
		sc.close();
		Demo d = new Demo();
		int sum = d.getSum(a, b);
		System.out.println("两个数的和是"+sum);
	}

}
class Demo{
	public int getSum(int a,int b){
		return a+b;
	}
}