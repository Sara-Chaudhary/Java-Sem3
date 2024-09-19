public class pet {
    String name ="ABC";
    pet(String a ){
        this.name = a;
    }
    pet(){
        System.out.println("This is pet class");
    }
    void print(){
        System.out.println("The name of the pet is : "+name);
    }
}

class dog extends pet{
    String breed;
    dog(String a, String b) {
        super(a);
        this.breed = b;
        System.out.println("This is a child dog class");
    }
    void bark(){
        System.out.println("Hi i am "+ name+ " a "+ breed );
    }
}

class m{
    public static void main(String[] args) {
        pet p1 = new pet();
        p1.print();
        dog d1 = new dog( "Tommy", "labra");
        d1.bark();
    }
}