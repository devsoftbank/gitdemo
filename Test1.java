package com.hai.chap01;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean bb = true;
		while(bb){
			System.out.println("�������·�");
			int month = sc.nextInt();
			if(month>=3&&month<=5){
				System.out.println("����");
			}else if(month>=6&&month<=9)
			{
				System.out.println("�ļ�");
			}else if(month>=10&&month<=11)
			{
				System.out.println("�＾");
			}else if(month==12||month==1||month==2){
				System.out.println("����");
			}else{
				System.out.println("��������·�����");
			}
		}
	}

}
