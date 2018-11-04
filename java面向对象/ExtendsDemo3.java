package com.hai.chap01;
public class ExtendsDemo3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son2 s = new Son2();
		s.show();
	}
}
class Father2{
	public String name = "李四";
	private int age = 20;
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public Father2(String name){
		this.name = name;
		System.out.println("父类构造方法"+name);
	}
	public Father2(){
		System.out.println("父类无参构造方法");
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
		String name = "张三";
		System.out.println(super.name);
		System.out.println(age);
		System.out.println("name="+name+",age="+super.getAge());
	}
	public Son2(String address){
		super("lisi");
		this.address = address;
		System.out.println("调用子类构造方法"+address);
	}
}