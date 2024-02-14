package com.driver;

public class Main {
    public static void main(String args[]){
        B objB=new B();
        String ans=objB.meth();
        System.out.println(ans);
        ans= objB.meth();
        System.out.println(ans);
    }
}
