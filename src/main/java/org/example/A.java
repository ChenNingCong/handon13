package org.example;

public class A {
    SQL connection;

    public A(SQL connection) {
        this.connection = connection;
    }

    public static int f1(int x)
    {
        x = x + 1;
        return x;
    }

    private static int f2(int x)
    {
        x = x + 2;
        return x;
    }

    static int test_f2(int x)
    {
       return f2(x);
    }

    protected static int f3(int x)
    {
        x = x + 3;
        return x;
    }

    private static int f4(int x)
    {
        x = x + 4;
        return x;
    }

    protected static int test_f4(int x)
    {
        return f4(x);
    }

    public static double f5(int x,int y)
    {
        return x/y;
    }

    public static int f6(int x)
    {
        if(x < 0)
        {
           throw new RuntimeException("x can't be negative");
        }

        return x + 5;
    }

    public static String f7(String s)
    {
        var ss = s + " more stuff";
        return ss;
    }

    public int f8(int x)
    {
        // Assume this calls a sql database such as "selct * from where something = x"
        connection.query(x);
        return f8_internal(x);
    }
    private int f8_internal(int x)
    {
        return x + 8;
    }
    protected int test_f8(int x) {
        return f8_internal(x);
    }
}
