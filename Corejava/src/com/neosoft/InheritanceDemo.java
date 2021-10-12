package com.neosoft;

public class InheritanceDemo {

	public static void main(String[] args) {
		Child a=new Child();
		a.showParent();
		Parent object=new Parent();
		object.parent_member1=100;
		B b=new B();

	}

}


class Parent{
	
	int parent_member1;
	void showParent() {
		System.out.println("parent");
	}
}


class Child extends Parent{
	int child_member1;
	
	void showchild() {
		System.out.println("child");
	}
	
	
}

class Child2 extends Child{
	int child2_member1;
}

class A{
	String name2;
	void show() {
		System.out.println(name2);
	}
}

class B extends A{
	
	String name2;
	super.show();
	void show() {
		name2="B";
		System.out.println(name2+"Parent"+super.name2);
	}
}
