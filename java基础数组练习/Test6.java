/*
 * 二维数组的定义格式3
 */
package com.hai.chap01;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//完整格式
//		int[][] arr = new int[][]{{1,3,5},{3,5,7},{44,3,9}};
		//简化格式
		int[][] arr = {{1,3,5},{3,5,7},{44,3,9}};
		//二维数组的长度
		System.out.println(arr.length);
		//第一个一维数组的长度
		System.out.println(arr[0].length);
		//第二个一维数组的长度
		System.out.println(arr[1].length);
		//第三个一维数组的长度
		System.out.println(arr[2].length);
		System.out.println(arr[2][2]);
	}

}
