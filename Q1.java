public class Q1 {
    int num=1 ; String b;
    Q1(int num){
        System.out.println("\nparametrised constructer");       
        this.num = num;
    }
    Q1(){
        System.out.println("\ndefault constructer");
    }
    Q1(String c){
        b = c;
    }
    void print(){
        System.out.println("Value of num = "+num);
    }
    public static void main(String[] args) {
        Q1 ob = new Q1(20);
        ob.print();
        Q1 on2 = new Q1();
        on2.print();
        Q1 ob2 = new Q1("Hello");
        System.out.println("\nMain method \nValue of string : "+ob2.b+"\n");
    }
}
