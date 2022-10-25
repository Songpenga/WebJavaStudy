package j07_반복;

public class Loop2 {

    public static void main(String[] args) {

        int result = 0;

        for (int i = 0; i < 100; i++) {
            result += i+1;
            System.out.println(i);

        }

        System.out.println("1~100까지 더한 값"+ result);

    }
}
