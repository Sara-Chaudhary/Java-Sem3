public class cons {
    cons(){
        System.out.println("This is default constructer");
    }
    cons(int a){
        this();
        System.out.println("This is parameterised constructer : "+ a);
    }
    void method(){
        System.out.println("This is a normal method");
    }

    public static void main(String[] args) {
        cons obj = new cons(10);
        obj.method();
    }
}
