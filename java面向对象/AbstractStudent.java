package com.hai.chap01;

public class AbstractStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SunBin ls = new SunBin("lisg",10,"大数据课堂");
		ls.show();
		ls.study();
		ls.eat();
		SunBin lss = new SunBin();
		lss.show();
		lss.study();
		lss.eat();
	}

}
abstract class Student{
	private String name;
	private int age;
	private String classes;
	public Student(){
		
	}
	public Student(String name,int age,String classes){
		this.name = name;
		this.age = age;
		this.classes = classes;
	}
	public void show(){
		System.out.println("name="+name+",age="+age+"classes="+classes);
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setClasses(String classes){
		this.classes = classes;
	}
	public String getClasses(){
		return classes;
	}
	public abstract void study();
	public abstract void eat();
}
class SunBin extends Student{
	public SunBin(){
		setName("xiaohai");
		setAge(30);
		setClasses("PHP");
	}
	public SunBin(String name,int age,String classes){
		super(name,age,classes);
	}
	public void study(){
		System.out.println(getName()+"学习了");
	}
	public void eat(){
		System.out.println(getName()+"吃放了");
	}
}
