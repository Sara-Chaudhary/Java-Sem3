public class ADD {
    int a = 10 , b = 30;
    ADD(){
        System.out.println("[default] The sum is: "+ (a+b));
    }
    ADD(int n){
        this();
        a = n;
        System.out.println("[Single parameter] The sum is: "+ (a+b));
    }
    ADD(int n , int m){
        this(n);
        a = n; b = m;
        System.out.println("[Double parameter] The sum is: "+ (a+b));
    }
    public static void main(String[] args) {
        ADD obj3 = new ADD(50,10 );
        obj3.a = 4;
    }
}
