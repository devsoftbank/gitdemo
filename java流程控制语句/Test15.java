/*
 * ��ת���continue��ʹ��
 */
package com.hai.chap01;

public class Test15 {
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			if(i==3){
				//return;    //��ӡ 1 2
				//break;      //��ӡ1 2 over
				continue;    //��ӡ1 2 4 5 6 7 8 9 over
			}
			System.out.println(i);
		}
		System.out.println("over");
	}
}
