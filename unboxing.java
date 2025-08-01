package oops_skill;

import java.util.ArrayList;

public class unboxing {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(10);  // Boxing
        int x = obj;                        // Unboxing

        System.out.println("object creation/cached object " + obj);
        System.out.println("unboxing " + x);
    }
}
