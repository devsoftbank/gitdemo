package com.hai.chap01;

public class Test11 {
	public static void main(String args){
		Teacher t = new Teacher();
		t.name = "����ʦ";
		t.age = 30;
		t.sex = 'Ů';
		t.eat();
		t.teacher("����");
	}
}
class Teacher{
	public String name;
	public int age;
	public char sex;
	public void eat(){
		System.out.println(name+"�ڳԶ���");
	}
	public void teacher(String classes){
		System.out.println(name+"��"+classes);
	}
}