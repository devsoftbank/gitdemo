/*
 * ѭ�������Ƕ����ϰ
 */
package com.hai.chap01;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int j=0;j<4;j++){
			for(int i=0;i<5;i++){
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		int row = sc.nextInt();
		System.out.println("����������");
		int colum = sc.nextInt();
		sc.close();
		for(int i=0;i<row;i++){
			for(int j=0;j<colum;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
