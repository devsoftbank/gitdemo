package com.hai.chap01;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//死循环，一般用在服务器，服务器是会一直接收客户端的请求的
		/*while(true){
			//一直做的事情
			//接收客户端的请求
		}
		*/
		int i = 0,sum = 0;
		while(i<=100){
			sum +=i;
			i++;
		}
		System.out.println("sum="+sum);
	}

}
