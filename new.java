class A
{
	int a =10;
	int b = 20;
	void help(){
		System.out.println("In the help method of parent class");
	}
}

class B extends A{
	int c = 20;
	void mid(){System.out.println("Hi , from middle child");}
}

class C extends B{
	int b = 30;
	void disp(){
	System.out.println("In the method of chlid class");
	}
	public static void main(String args[]){
		//B ob1 = new B();
		//A ob2 = new B();
		C ob3 = new C();
		//System.out.println(ob1.a +" "+ ob1.b+"\n"+ob2.a +" "+ ob2.b);
		System.out.println(ob3.a +" "+ ob3.b+" "+ob3.c);
		ob3.help();ob3.disp();ob3.mid();
		
	}
}
