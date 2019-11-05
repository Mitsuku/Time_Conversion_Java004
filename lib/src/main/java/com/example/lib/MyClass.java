package com.example.lib;

import java.util.Scanner;

public class MyClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter time(s)");
        int a = sc.nextInt();
        long hour=a/3600;
        long minute=a%3600/60;
        long second=a%60;
        System.out.println(hour+":"+minute+":"+second);
    }
}