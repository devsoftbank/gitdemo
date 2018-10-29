package com.hai.chap01;

import java.util.Scanner;

public class Test3{
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要查找的元素");
		int key = sc.nextInt();
		sc.close();
		int[] arr = {1,4,9,43,9};
		//我想要查找的key在arr数组中第一次出现的位置，如果不存在则返回一个-1
		//假设我现在有一个方法已经实现了这个功能
		int location = searchKey(arr,key);
		//根据返回值打印输出我们自己的文案
		if(location==-1){
			System.out.println("你要查找的值不存在");
		}else{
			System.out.println("你查找元素的位置在第"+(location+1)+"个位置");
		}
	}
	public static int searchKey(int[] arr,int key){
		//遍历数组元素和key做比较，一旦想等就返回当前的下标，
		//并结束方法将结果返回
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;
			}
		}
		//如果代码走到这里了，就说明key在数组中不存在
		return -1;
	}
}
