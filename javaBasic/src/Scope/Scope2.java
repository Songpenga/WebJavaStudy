package Scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;// m생존 시작
        for (int i = 0; i < 2; i++){// 블록내부, for문 내
            System.out.println("for m = " + m);// 불록 내부에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } // i 생존 종료
    }
}