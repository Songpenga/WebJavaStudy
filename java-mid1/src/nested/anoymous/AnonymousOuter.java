package com.example.nested.anoymous;

import com.example.nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;
        Printer printer = new Printer(){
            int val = 32;

            @Override
            public void print() {
                System.out.println("val = " + val);
                System.out.println("localVar = " + localVar);
                //System.out.println("param = " + param);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
