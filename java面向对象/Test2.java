package com.hai.chap01;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub				
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入长方形的长");
			int length = sc.nextInt();
			System.out.println("请输入长方形的宽");
			int width = sc.nextInt();
			if(length<=0||width<=0){
				System.out.println("你输入的长方形的长和宽有误,请重新输入");
				continue;
			}else{
				sc.close();
				Rectangle r = new Rectangle();
				int periMeter = r.getPerimeter(length,width);
				float area = r.getArea(length,width);
				if(periMeter==-1||area==-1){
					System.out.println("该长方形的周长和面积不存在");
					return;
				}
				System.out.println("长方形的周长是："+periMeter);
				System.out.println("长方形的面积是："+area);
				return;
			}			
		}		
	}
}
class Rectangle{
	public int getPerimeter(int length,int width){
		if(length<=0||width<=0){
			System.out.println("你输入长方形的长和宽不能小于0");
			return -1;
		}
		return 2*(length+width);
	}
	public float getArea(int length,int width){
		if(length<=0||width<=0){
			System.out.println("你输入长方形的长和宽不能小于0");
			return -1;
		}
		return length*width;
	}
}
