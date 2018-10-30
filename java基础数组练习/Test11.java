package com.hai.chap01;

public class Test11 {
	public static void main(String args){
		Teacher t = new Teacher();
		t.name = "李老师";
		t.age = 30;
		t.sex = '女';
		t.eat();
		t.teacher("语文");
	}
}
class Teacher{
	public String name;
	public int age;
	public char sex;
	public void eat(){
		System.out.println(name+"在吃东西");
	}
	public void teacher(String classes){
		System.out.println(name+"教"+classes);
	}
}