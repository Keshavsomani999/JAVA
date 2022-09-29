class Base{
    Base(){
        System.out.println("i am a constructer");
    }
    Base(int x){
        System.out.println("i am x" + x);
    }
}

class Derived extends Base{

    Derived(){
        System.out.println("i am derived clas contructor");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("i am y" + y);
    }

}
class Child extends Derived{
    Child(){
        System.out.println("I am child");

    }
    Child(int x ,int y,int z){
        super(x,y);
        System.out.println("i am z" + z);
    }

}

public class inheritance {
    public static void main(String[] args) {
//        Base b = new Base(3);
//        Derived d = new Derived(22,2,8);
        Child c = new Child(9,8,3);


    }
}
