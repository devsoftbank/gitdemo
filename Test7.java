/*
 * 遍历二维数组里的一维数据
 */
package com.hai.chap01;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{2,3,3},{5,3,7},{33,22,77}};
		printArray(arr);
	}
	//遍历二维数组
	public static void printArray(int[][] arr){
		//先将二维数组中的一维数组遍历出来
		for(int i=0;i<arr.length;i++){
			printArray(arr[i]);
		}
	}
	//遍历一维数组
	public static void printArray(int[] arr){
		//将一维数组里面的元素遍历出来
		for(int j=0;j<arr.length;j++){
			//判断数组元素为1的时候
			if(arr.length==1){
				System.out.print("["+arr[j]+"]");
		//判断当数组长度大于1的时候，判断是不是第一元素
			}else if(j==0){
				System.out.print("["+arr[j]+",");
		//判断当数组长度大于1的时候，输出最后面一个元素
			}else if(j==arr.length-1){
				System.out.print(arr[j]+"]\t\n");
			}else{
				System.out.print(arr[j]+",");
			}
		}
		System.out.println();				
	}
}
