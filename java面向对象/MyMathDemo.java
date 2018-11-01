package com.hai.chap01;
class MyMathDemo{
	public static void main(String[] args){
		MyMath m = new MyMath();
		int result = m.div(5,1);
		int[] arr = {1,8,9,10};
		int addResult = m.add(arr);
		System.out.println("result="+result);
		System.out.println("result="+addResult);
	}
}

class MyMath {
	public int add(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum +=arr[i];
		}
		return sum;
	}
	public int sub(int a,int b){
		return a-b;
	}
	public int mul(int[] arr){
		int sum = 1;
		for(int i=0;i<arr.length;i++){
			sum *=arr[i];			
		}
		return sum;
	}
	public int div(int a,int b){
		if(b==0){
			System.out.println("除数不能为0");
			return -1;
		}
		return a/b;
	}
}
