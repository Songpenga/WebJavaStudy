package j07_반복;

public class Loop6 {
    public static void main(String[] args) {
        int n = 5;

        //반복 탈출 조건
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);

        }

        int i = 0;
        while (i < n) { //조건문 if가 결합된 반복문
            System.out.println(i + 1);
            i++;
        }
    }
}
