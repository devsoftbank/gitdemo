package com.hai.chap01;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i = 0;
		while(i<100){
			System.out.println("�й�");
			i++;	
		}
		*/   //while���ʵ��
		/*for(int i=0;i<100;i++){
			System.out.println("�й�");
		}
		 */ //for���ʵ��
		//��1-100�ĺ�
		/*int sum = 0;
		for(int i=1;i<=100;i++){
			sum +=i;
		}
		System.out.println("sum="+sum);
		*/
		//��1-100������ż���ĺ�
		/*int sum = 0,sum1=0,sum2=0;
		for(int i=1;i<=10000;i++){
			sum +=i;
			sum2 = sum-sum1;
			if(i%2!=0){
//				System.out.println(i);
				sum1 +=i;
			}
		}
		System.out.println("�����ĺ��ǣ�sum1="+sum1);
		System.out.println("ż���ĺ��ǣ�sum2="+sum2);
		*/
		long doubleSum = 0;
		long singleSum = 0;
		for(int i=1;i<=1500;i++){
			if(i%2==0){
				doubleSum +=i;
			}else{
				singleSum +=i;
			}
		}
		System.out.println("0-100��ż�����ǣ�"+doubleSum+",0-100���������ǣ�"+singleSum);
	}

}
