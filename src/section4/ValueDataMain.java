package section4;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자 = " + valueData.val);
    }

    static void add(ValueData valueData){
        valueData.val++;
        System.out.println("증가 = " + valueData.val);
    }
}
