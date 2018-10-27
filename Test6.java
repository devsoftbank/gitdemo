package com.hai.chap01;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		for(int i=1;i<=1000;i++){
			if(i%3==2){
				a++;
			}
			if(i%5==3){
				b++;
			}
			if(i%7==2){
				c++;
			}
		}
		System.out.println("1-1000除以3余2的个数有："+a+"个");
		System.out.println("1-1000除以5余3的个数有："+b+"个");
		System.out.println("1-1000除以7余2的个数有："+c+"个");
	}
}
