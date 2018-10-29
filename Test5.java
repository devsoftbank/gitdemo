/*
 * 二维数组定义格式2
 */
package com.hai.chap01;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[5];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);	
		arr[0][2] = 100;
		System.out.println(arr[0][2]);
	}

}
