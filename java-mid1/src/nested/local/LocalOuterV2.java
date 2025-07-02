package com.example.nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int param){
        int localVar = 11;

        class LocalPrinter implements Printer{
            int val = 0;

            public void printData(){
                System.out.println("val = " + val);
                System.out.println("localVar = " + localVar);
                System.out.println("param = " + param);
                System.out.println("outInstanceVar = " + outInstanceVar);

            }

            @Override
            public void print() {
                
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();;
    }

    public static void main(String[] args) {
        LocalOuterV2 local = new LocalOuterV2();
        local.process(3);
    }
}
