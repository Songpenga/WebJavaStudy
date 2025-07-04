package com.example.nested.local;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int param){
        int localVar = 11; //지역변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer{
            int val = 0;
            @Override
            public void print() {
                System.out.println("val = " + val);

                //인스턴스는 저역변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("param = " + param);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();

        //printer.print(); 를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        //printer.print();;

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 local = new LocalOuterV3();
        Printer printer = local.process(33);

        //printer.print();를 나중에 실행한다. process()의
        // 스택 프레임이 사라진 이후에 실행
        printer.print();

        
    }
}
