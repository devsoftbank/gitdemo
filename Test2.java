package com.hai.chap01;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODOto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println("���������������");
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
		}//�ڶ��ָ�ʽǶ�׵ڶ��ָ�ʽ
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
		}//�����ָ�ʽǶ�׵ڶ��ָ�ʽ
		System.out.println("max="+max);
	}

}
