package com.hai.chap01;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("�������·�(1-12)");
			int month = sc.nextInt();
			switch(month){
				case 1:
				case 2:
				case 3:
					System.out.println("����");
					break;
				case 4:
				case 5:
				case 6:
					System.out.println("�ļ�");
					break;
				case 7:
				case 8:
				case 9:
					System.out.println("�＾");
					break;
				case 10:
				case 11:
				case 12:
					System.out.println("����");
					break;
				default:
					System.out.println("��������·�����");
					break;
			}
		}
	}

}
