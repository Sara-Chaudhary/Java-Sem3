import java.util.Scanner;
public class parrot {
    private String str;

    public String getstr(){
        return str;
    }

    public void setstr(String s){
        this.str = s;
    }
   
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        parrot obj1 = new parrot();
        System.out.print("\nHi I am a parrot .\nEnter a string: ");
        obj1.setstr(s.nextLine());
        System.out.println("ME :- "+ obj1.getstr());
        s.close();
    }
}