package com.santoshi;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> l3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(l1.hashCode());
        System.out.println(l3.hashCode());

       List<Integer> l2=l1.stream()
                .filter(item -> item % 2==0).collect(Collectors.toList());

        System.out.println(l2);
    }
}
