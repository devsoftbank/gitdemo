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
		System.out.println("我是静态代码块");
	}
	{
		System.out.println("我是构造代码块");
	}
	public BlockCode(){
		System.out.println("我是构造方法代码块");
	}
	public void show(){
		{
			int a = 10;
			System.out.println(a);
			System.out.println("普通代码块");
		}
		int b = 20;
		System.out.println(b);
	}
}