package com.hai.chap01;
/*
 * ���� ���Ҹ߶���4.8�ף�����һ���㹻���ֽ��ֽ�ŵĺ����0.012�ף�
 * ������Ҫ�۵����ٴο��Գ������ҵĸ߶�
 */
public class Test9 {
	public static void main(String[] args){
		int count = 0;
		int number = 1;
		while((number*12)<4800){
			count++;
			number *=2;
		}
		System.out.println("һ������"+count+"��");
		
		/*int count=0;
		for(;number*12<4800;count++){
			number *=2;
		}
		System.out.println("һ������"+count+"��");	
		*/
	}
}
