package com.example.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(final int param){
        int localVar = 11; //지역변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        localVar = 22;
        // 지역변수는 중간에 값이 바뀌면 안된다.
        //  error :: 변수 'localVar'은(는) 내부 클래스 내에서 액세스되므로 final 또는 유사 final이어야 합니다

        class LocalPrinter implements Printer{
            int val = 0;
            @Override
            public void print() {
                System.out.println("val = " + val);

                //인스턴스는 지역변수보다 더 오래 살아남는다.
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

        /*추가 - 지역변수캡처2 */
        //믿음이 부족해 코드로 확인

        System.out.println("필드확인");
        Field[] fields = printer.getClass().getDeclaredFields();;
        for(Field field : fields){
            System.out.println("field = " + field);

        }

        
    }
}
