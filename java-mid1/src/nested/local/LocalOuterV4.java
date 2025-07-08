package com.example.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 4;

    public Printer process(int param){
        int localVar = 11;

        class LocalPrinter implements Printer{
            int val = 0;
            @Override
            public void print() {
                System.out.println("val = " + val);

                System.out.println("localVar = " + localVar);
                System.out.println("param = " + param);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면?
        // localVar = 19; // 에러가남

        param = 299;
        //변수 'param'은(는) 내부 클래스 내에서 액세스되므로 final 또는 유사 final이어야 합니다

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 local = new LocalOuterV4();
        Printer printer = local.process(33);

        printer.print();

        System.out.println("필드확인");
        Field[] fields = printer.getClass().getDeclaredFields();;
        for(Field field : fields){
            System.out.println("field = " + field);

        }

        
    }
}
