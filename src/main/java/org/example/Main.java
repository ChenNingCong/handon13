package org.example;

class B {
     static int g1(int x, A a) {
        return a.f8(x);
    }

}

class TestB {
    public static int test_g1(int x, A a) {
        return B.g1(x, a);
    }
}

public class Main {
    public static void main(String[] args)
    {

        var v1 = A.f1(1);
        var v5 = A.f5(5,2);
        var v6 = A.f6(3);
        var v7 = A.f7("hello");
        SQL connection = new SQL();
        var a = new A(connection);
        var v8 = B.g1(1,a);
    }
}