package com.hai.chap01;

public class BlockCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockCode bc = new BlockCode();
		bc.show();
		BlockCode bc2 = new BlockCode();
		bc2.show();
	}

}
class BlockCode{
	static{
		System.out.println("���Ǿ�̬�����");
	}
	{
		System.out.println("���ǹ�������");
	}
	public BlockCode(){
		System.out.println("���ǹ��췽�������");
	}
	public void show(){
		{
			int a = 10;
			System.out.println(a);
			System.out.println("��ͨ�����");
		}
		int b = 20;
		System.out.println(b);
	}
}