package 接口;

/**
 * 接口(interface)的特点：
 * 		1.java接口是对功能的拓展
 * 		2.通过实现接口，java类可以实现多实现
 * 		3.一个类可以同时继承一个父类并且实现多个接口
 * 		4.接口与接口之间可以通过extends来产生继承关系
 * 		5.接口不能被实例化
 * 		6.静态常量
 * 
 * 抽象类和接口的区别：
 *1.抽象类和具体实现类之间是一种继承关系，也就是说如果采用抽象类的方式，则父类和子类在概念上应该是相同的
 *2.接口和实现类在概念上不要求相同，接口只是抽取相互之间没有关系的类的共同特征，而不去关注类之间的关系，他可以使没有层次关系的类具有相同的行为	
 *3.抽象类是对一组具有相同属性的行为的逻辑上有关系的事物的一种抽象
 *	而接口则是对一组具有相同属性和行为的逻辑上不相关的事物的一种抽象
 * 
 * 
 * 抽象类表示的是is-a的关系
 * 接口表示的是like-a的关系
 *  
 * 
 * 
 * 抽象类是继承关系，在逻辑上有关系
 * 接口在逻辑上是不相关的
 * 
 * 
 * 抽象类需要使用extends来实现，在java中只能单继承
 * 接口需要使用implements来实现，在java中可以多实现
 * 
 * 
 * 面向接口编程
 * 		开发项目的时候，主体大量使用接口，用接口构成系统的骨架
 * 		这样就可以通过更换接口的实现类来更换系统的功能
 * @author oracleOAEC
 *
 */
public class Test {
	
	public static void main(String[] args) {
		MyInterFace my = new MyImpl();
		my.aa(1, 2);
		
		My2InterFace my2 = new MyImpl();
		my2.bb("d");
		System.out.println(MyInterFace.age);
	}
	
	/*int a = 10;
	static int b = 10;
	final int c = 20;
	final static int d = 20;
	
	public void ss(){
		
	}
	
	public static void aa(){}
	
	public abstract void bb();*/

}
