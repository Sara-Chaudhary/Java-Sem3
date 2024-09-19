public class Students {
    String name  , email;
    int phone , age ; 

    Students(String ar[]){
        name = ar[0];
        email = ar[2];
        age = Integer.parseInt(ar[1]);
    }

    void print(){
        System.out.println("\nName : "+name+"\nEmail : "+email+"\nAge: "+age+"\n");
    }

    public static void main (String args[]){
        Students s1 = new Students(args);
        s1.print();
    }
}
