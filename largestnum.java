public class largestnum {

    void cal (int a , int b , int c){     
        if (a > b && a > c){
            System.out.println(a+" is the largest number");
        } else if ( b > a && b > c){
            System.out.println(b+" is the largest number");
        } else {
            System.out.println(c+" is the largest number");
        }
    }

    public static void main(String[] args) {
        largestnum obj = new largestnum();
        obj.cal(20, 10, 100);
    }

}
