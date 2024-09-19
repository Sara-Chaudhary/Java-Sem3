public class SI {  
    int price = 100 ;
    float rate = 10  ,time = 10 ;

    public void sical() {
        float si = price * rate * time / 100 ;
        System.out.println("The Simple interest is "+ si);
    }

    public static void main(String[] args) {
        SI obj1 = new SI();
        obj1.sical();
    }
}
