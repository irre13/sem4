package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList reverseList = new ArrayList();
        reverseList.add("1");
        reverseList.add("2");
        reverseList.add("3");
        reverseList.add("4");
        reverseList.add("5");
        Collections.reverse(reverseList);
        System.out.println(reverseList);
    }
}