package com.hai.chap01;

public class ExtendsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZhangSan zs = new ZhangSan();
		zs.eat();
		zs.print();
		System.out.println(zs.address);
	}

}
class Person{
	public String name;
	public int age;
	public void eat(){
		System.out.println("�Է�");
	}
	public void sop(String msg){
		System.out.println(msg);
	}
}
class A extends Person{
	
}
class ZhangSan extends A{
	public String address = "ɽ��";
	public void print(){
		sop("���еķ���");
	}
}
class LiSi extends Person{
	
}