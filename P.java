class P {
    int a = 20;
    void disp(){
        System.out.println("Method from super class A");
    }
}
class Q extends P{
    int b = 30;
    void help(){
        System.out.println("Method from child class B");
    }
}
class R extends P{
    int c = 10;
    void has(){
        System.out.println("Metod from child class C");
    }
    public static void main(String[] args) {
        R r1 = new R();
        Q q1 = new Q();
        System.out.println(r1.a+" "+r1.c);
        r1.disp();r1.has();
        System.out.println(q1.a+" "+q1.b);
        q1.disp();q1.help();;
    }
}