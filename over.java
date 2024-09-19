public class over {
    void A(){
        System.out.println("I am in default method");
    }
    void A(int a){
        System.out.println("I am in 1 int method");
    }
    void A(String a){
        System.out.println("I am in 1 string method");
    }
    void A(int a , int b){
        System.out.println("I am in 2 int method");
    }
    void A(int a , float c){
        System.out.println("I am in 1 int & 1 float method");
    }

    public static void main(String[] args) {
        over abc = new over();
        abc.A();
        abc.A("Hello");
        abc.A(10);
        abc.A(10, 20.5f);
        abc.A(20, 21);
    }
}
