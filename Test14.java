/*
 * ��ת���break��continue���ۺ���ϰ
 * 
 */
package com.hai.chap01;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
			if(i%3==0){
				//break;   //��ӡ�����й�
				//continue;   //��ӡ�ߴ��й�
				//System.out.println("�й�");//��ӡ13���й�
				return;     //����main����
			}
			System.out.println("�й�");
		}
	}
}
