package test.base;

public class NewClass {
    public static void main(String[] args) {
//        Integer a = 1;
//        Integer b = 2;
//        Long c = 3L;
//        System.out.println(c == (a + b));
//        System.out.println(c == (a + b));
        System.out.println("hello world");
        new B();

    }
}

class A{
    public A() {
        System.out.println("A constructor");
    }

    static {
        System.out.println("A static");
    }

    {
        System.out.println("A block");
    }
}

class B extends A{
    public B() {
        System.out.println("B constructor");
    }

    static {
        System.out.println("B static");
    }

    {
        System.out.println("B block");
    }
}