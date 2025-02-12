package section3;

public class MethodChange2 {
    public static void main(String[] args) {
        Data a = new Data();
        a.value = 10;
        System.out.println("메서드 호출 전 : a = " + a.value);
        changePrimitve1(a);
        System.out.println("메서드 호출 후 : a = " + a.value);
    }

    public static void changePrimitve1(Data cnt){
        cnt.value = 5555;
    }
}
