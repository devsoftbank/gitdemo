package com.hai.chap01;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZhangSann zs = new ZhangSann();
		zs.say(1, 1);
	}

}
abstract class Personn{
	public int age = 20;
	public final String name = "ÀîËÄ";
	public Personn(){
		
	}
	public abstract void say(int a ,int b);
}
class ZhangSann extends Personn{
	public void say(int a,int b){
		System.out.println(a+b);
	}
}