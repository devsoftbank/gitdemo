package com.hai.chap01;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub				
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("�����볤���εĳ�");
			int length = sc.nextInt();
			System.out.println("�����볤���εĿ�");
			int width = sc.nextInt();
			if(length<=0||width<=0){
				System.out.println("������ĳ����εĳ��Ϳ�����,����������");
				continue;
			}else{
				sc.close();
				Rectangle r = new Rectangle();
				int periMeter = r.getPerimeter(length,width);
				float area = r.getArea(length,width);
				if(periMeter==-1||area==-1){
					System.out.println("�ó����ε��ܳ������������");
					return;
				}
				System.out.println("�����ε��ܳ��ǣ�"+periMeter);
				System.out.println("�����ε�����ǣ�"+area);
				return;
			}			
		}		
	}
}
class Rectangle{
	public int getPerimeter(int length,int width){
		if(length<=0||width<=0){
			System.out.println("�����볤���εĳ��Ϳ���С��0");
			return -1;
		}
		return 2*(length+width);
	}
	public float getArea(int length,int width){
		if(length<=0||width<=0){
			System.out.println("�����볤���εĳ��Ϳ���С��0");
			return -1;
		}
		return length*width;
	}
}
