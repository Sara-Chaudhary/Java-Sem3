abstract class Abstract {
    void help(){
        System.out.println("Concrete method of abstract class");
    }
    abstract void display();
}
class Child extends Abstract{
    void display(){
        System.out.println("Abstract method of child class");
    }
    void help(){
        System.out.println("Overridden method of child class");
    }
    
    public static void main(String[] args) {
        Abstract obj=new Child();
        obj.display();
        obj.help();
    }
}



