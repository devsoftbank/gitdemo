package com.hai.chap01;
public class ExtendsDemo3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son2 s = new Son2();
		s.show();
	}
}
class Father2{
	public String name = "����";
	private int age = 20;
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public Father2(String name){
		this.name = name;
		System.out.println("���๹�췽��"+name);
	}
	public Father2(){
		System.out.println("�����޲ι��췽��");
	}
}
class Son2 extends Father2{
	public String address;
	public Son2(){		
		
		this("zhsgl");
	}
	
	public void show(){
//		setAge(30);
		int age = 10;
		String name = "����";
		System.out.println(super.name);
		System.out.println(age);
		System.out.println("name="+name+",age="+super.getAge());
	}
	public Son2(String address){
		super("lisi");
		this.address = address;
		System.out.println("�������๹�췽��"+address);
	}
}