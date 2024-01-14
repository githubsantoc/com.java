package com.santoshi;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {
        Set<Object> A = new HashSet<>();
        A.add( 23);
        A.add("Hari");
        A.add("Gita");
        A.add("Sita");

        Set<Integer> B = Set.of(1, 2, 3, 4, 5);
        A.addAll(B);
        //Set<Integer> union = A;
         System.out.println(A);
    }
}
