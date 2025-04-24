package lang.math;

import java.util.Random;

/*
    * 랜덤의 경우 Math.random() 을 사용해도 되지만 Random 클래스를 사용하면 더욱 다양한 랜덤값을 구할 수 있다.
    * 참고로 Math.random() 도 내부에서는 Random 클래스를 사용한다.참고로 Random 클래스는 java.util 패키지 소속이다.
*/
public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
        //Random random = new Random(1); seed가 같으면 Random의 결과가 같다

        int randomInt = random.nextInt();
        System.out.println("randomInt :: " + randomInt);

        double rdDouble = random.nextDouble();
        System.out.println("randomDouble :: " + rdDouble); // 0.0d ~ 1.0d

        boolean rdBool = random.nextBoolean();
        System.out.println("bool :: " + rdBool);

        //범위 조회
        int ranRange1 = random.nextInt(10);
        System.out.println(ranRange1); // 0 ~ 9

        int ranRange2 = random.nextInt(10)+1 ;
        System.out.println(ranRange2); // 1 ~ 10
    }
}
