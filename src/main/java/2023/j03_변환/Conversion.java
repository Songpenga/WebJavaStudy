package j03_변환;

public class Conversion {
    public static void main(String[] args) {
        // upcastion(업캐스팅)
        char cast1 = 'a';
        System.out.println((int) cast1);

        int cast2 = (int) cast1;
        System.out.println((int) cast2);

        //downcasting

        int cast3 = 98;
    char cast4 = (char) cast3;
    System.out.println((int) cast4);

//java: incompatible types: possible lossy conversion from int to char
        // 묵시적 변환. 명시적 변환

        double cast5 = 3.14;
        int cast6 = (int) cast5;
        System.out.println(cast6); // 명시적 형변환
        double cast7 = cast6;
        System.out.println(cast7);

    }
}
