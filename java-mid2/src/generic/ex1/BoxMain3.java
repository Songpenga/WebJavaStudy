package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정
        integerBox.setVal(10);
        //integerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류
        Integer i = integerBox.getVal(); // Integer 타입 반환 (캐스팅 X)
        System.out.println("integer ::" + i);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.setVal("Hello"); // String 타입만 허용
        String str = stringBox.getVal(); // String 타입만 반환
        System.out.println("str ::" + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.setVal(10.17);
        Double db = doubleBox.getVal();
        System.out.println("Double ::" + db);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>(); // 타입추론 :::
    }

}