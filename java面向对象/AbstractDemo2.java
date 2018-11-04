package com.hai.chap01;

public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherHuu zh = new TeacherHuu("LISL",20);
		zh.teach();
		if(zh.getAge()==20){
			System.out.println(zh.getName()+"老师真年轻");
		}		
	}
}
abstract class Teacherr{
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public Teacherr(String name,int age){
		this.name = name;
		this.age = age;
	}
	public abstract void teach();
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
class TeacherHuu extends Teacherr{
	public void teach(){
		System.out.println(getName()+"胡老师教JAVASE");
	}
	public TeacherHuu(String name,int age){
		super(name,age);
		System.out.println("name="+name+",age="+age);
	}
}