package com.hai.chap01;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODOto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数");
		int c = sc.nextInt();
		int max;
		/*if(a>b){
			if(a>c){
				max = a;
			}else{
				max = c;
			}
		}else{
			if(b>c){
				max = b;
			}
			else{
				max = c;
			}
		}//第二种格式嵌套第二种格式
		*/
		if(a>b){
			if(a>c){
				max = a;
			}else{
				max = c;
			}
		}else if(b>c){
			max = b;
		}else{
			max = c;
		}//第三种格式嵌套第二种格式
		System.out.println("max="+max);
	}

}
