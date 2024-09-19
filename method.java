// program to diffentiate btw Instance and Static methods and variables

class method {
    int i=0;
    static int s=0;
    void instancemethod(){
        System.out.println("instance variable : "+ i);
    }

    static void staticmethod(){
        System.out.println("Static variable: "+s);
    }
    public static void main(String args[]){
        method O = new method();
        O.i = 10;
        O.instancemethod();
        s=20;
        staticmethod();
        System.out.println(O.i);
        System.out.println(s);
    }
}