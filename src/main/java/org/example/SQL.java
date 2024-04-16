package org.example;

public class SQL {
    public int query(int x) {
        if (x > 0) {
            throw new RuntimeException("Test shouldn't call this function");
        }
        return x;
    }
}
