package com.hai.chap01;

import java.util.Scanner;

public class Test3{
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ�Ԫ��");
		int key = sc.nextInt();
		sc.close();
		int[] arr = {1,4,9,43,9};
		//����Ҫ���ҵ�key��arr�����е�һ�γ��ֵ�λ�ã�����������򷵻�һ��-1
		//������������һ�������Ѿ�ʵ�����������
		int location = searchKey(arr,key);
		//���ݷ���ֵ��ӡ��������Լ����İ�
		if(location==-1){
			System.out.println("��Ҫ���ҵ�ֵ������");
		}else{
			System.out.println("�����Ԫ�ص�λ���ڵ�"+(location+1)+"��λ��");
		}
	}
	public static int searchKey(int[] arr,int key){
		//��������Ԫ�غ�key���Ƚϣ�һ����Ⱦͷ��ص�ǰ���±꣬
		//�������������������
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;
			}
		}
		//��������ߵ������ˣ���˵��key�������в�����
		return -1;
	}
}
