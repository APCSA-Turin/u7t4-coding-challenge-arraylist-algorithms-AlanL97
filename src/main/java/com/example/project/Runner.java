package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 3, 1, 4, 4, 3, 1));
        System.out.println(Main.fix34(intList));
    }
}