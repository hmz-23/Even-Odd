package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a  number: ");
        n = sc.nextInt();

        if(n%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
