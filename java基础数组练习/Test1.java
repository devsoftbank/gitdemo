package com.hai.chap01;

public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,-85,-200,600};
		int[] result = getMaxAndMin(arr);
		int min = result[0];
		int max = result[1];
		System.out.println("当前数组的最小值="+min);
		System.out.println("当前数组的最大值="+max);
	}	
	public static int[] getMaxAndMin(int[] arr){
		int min = arr[0];
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			int value = arr[i];
			if(value>max){
				max = value;
			}
			if(value<min){
				min = value;
			}				
		}
		int[] result = {min,max};
		return result;
	}
}
