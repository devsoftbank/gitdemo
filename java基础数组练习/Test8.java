package com.hai.chap01;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入杨辉三角的行数");
		int n = sc.nextInt();
		sc.close();
		int[][] arr = new int[n][n];
		//将所有行的第一列和最后一列设为1
		
		for(int i=0;i<arr.length;i++){
			arr[i][0]=1;
			arr[i][i]=1;
		}
		for(int i=2;i<arr.length;i++){
			for(int j=1;j<arr[i].length;j++){
				arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
			}
		}
		//遍历二维数组，有几行就有几列
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
