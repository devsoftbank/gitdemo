package com.hai.chap01;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println("name="+p.name+",age="+p.age+",sex="+p.sex);
		p.name="张三";
		p.age=10;
		p.sex='男';
		System.out.println("name="+p.name+",age="+p.age+",sex="+p.sex);
		p.eat("鱼");
		p.sleep("8个小时");
		p.study("语文");
	}

}
class Person{
	public String name;
	public int age;
	public char sex;
	public void eat(String food){
		System.out.println(name+"吃的是"+food);
	}
	public void sleep(String time){
		System.out.println(name+"睡了"+time);
	}
	public void study(String classes){
		System.out.println(name+"学了"+classes);
	}
}
