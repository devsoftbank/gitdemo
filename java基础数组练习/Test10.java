package com.hai.chap01;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println("name="+p.name+",age="+p.age+",sex="+p.sex);
		p.name="����";
		p.age=10;
		p.sex='��';
		System.out.println("name="+p.name+",age="+p.age+",sex="+p.sex);
		p.eat("��");
		p.sleep("8��Сʱ");
		p.study("����");
	}

}
class Person{
	public String name;
	public int age;
	public char sex;
	public void eat(String food){
		System.out.println(name+"�Ե���"+food);
	}
	public void sleep(String time){
		System.out.println(name+"˯��"+time);
	}
	public void study(String classes){
		System.out.println(name+"ѧ��"+classes);
	}
}
