/*
 * ������ά�������һά����
 */
package com.hai.chap01;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{2,3,3},{5,3,7},{33,22,77}};
		printArray(arr);
	}
	//������ά����
	public static void printArray(int[][] arr){
		//�Ƚ���ά�����е�һά�����������
		for(int i=0;i<arr.length;i++){
			printArray(arr[i]);
		}
	}
	//����һά����
	public static void printArray(int[] arr){
		//��һά���������Ԫ�ر�������
		for(int j=0;j<arr.length;j++){
			//�ж�����Ԫ��Ϊ1��ʱ��
			if(arr.length==1){
				System.out.print("["+arr[j]+"]");
		//�жϵ����鳤�ȴ���1��ʱ���ж��ǲ��ǵ�һԪ��
			}else if(j==0){
				System.out.print("["+arr[j]+",");
		//�жϵ����鳤�ȴ���1��ʱ����������һ��Ԫ��
			}else if(j==arr.length-1){
				System.out.print(arr[j]+"]\t\n");
			}else{
				System.out.print(arr[j]+",");
			}
		}
		System.out.println();				
	}
}
