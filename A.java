class A {
    private int a =10;
    int geta(){
        return a;
    }
    void seta(int n){
        this.a = n;
    }
    void disp() {
        System.out.println("method of super class A");
    }
}
class B extends A {
    void my() {
        System.out.println("method of derived class B also the parent class for c");
    }
}
class C extends B {
    void help() {
        System.out.println("method of child class C");
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.disp();
        obj.my();
        obj.help();
        System.out.println("A before : "+obj.geta());
        obj.seta(40);
        System.out.println("A after : "+obj.geta());
    }
}

