package com.hai.chap01;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������������ǵ�����");
		int n = sc.nextInt();
		sc.close();
		int[][] arr = new int[n][n];
		//�������еĵ�һ�к����һ����Ϊ1
		
		for(int i=0;i<arr.length;i++){
			arr[i][0]=1;
			arr[i][i]=1;
		}
		for(int i=2;i<arr.length;i++){
			for(int j=1;j<arr[i].length;j++){
				arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
			}
		}
		//������ά���飬�м��о��м���
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
