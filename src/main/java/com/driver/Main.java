package com.driver;

public class Main {
    public static void main(String args[]){
        B objB=new B();
        String ans=objB.meth();
        System.out.println(ans);
        ans= objB.meth();
        System.out.println(ans);
    }

    public static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";


        }
    }

    public static class A {

            public String meth(){
                return "Invoking method from class A";

        }
    }
}
