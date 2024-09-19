class myclass {
    int a=10;
    myclass(int a){
        System.out.println("this is parameterized constructor ");
        this.a=a;
    }
   
    public static void main(String[] args){
        myclass obj= new myclass(20);
        System.out.println(obj.a);
    }
    
}