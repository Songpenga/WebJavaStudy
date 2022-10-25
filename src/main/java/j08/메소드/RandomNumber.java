package j08.메소드;
//1024-2.1
import java.util.Random;

public class RandomNumber { //3
    //함수는 클래스 안에 작성한다.
    public static int clacRandom(int n){
        Random random = new Random(); // 별개의 지역으로 선언
        int result = random.nextInt(10)*1000 + n;

        return  result;

    }
    public static void main(String[] args) {
         Random random = new Random();
        int money = random.nextInt(10)*1000; //3

        //Random 은 자료형
        /*2

        int a = random.nextInt(10)+1000+money;
        System.out.println(a);
        int b = random.nextInt(10)+1000+money;
        System.out.println(b);
        int c = random.nextInt(10)+1000+money;
        System.out.println(c);
        int d = random.nextInt(10)+1000+money;
        System.out.println(d);
*/
/*1
        for (int i = 0; i < 10; i++) {
            //alt +shift
            int randNum = random.nextInt(100) ;
            System.out.println(randNum);



        }
*/

        System.out.println(clacRandom(money));
        int r = clacRandom(money);
        System.out.println(r+100);

        //System.out.println(a+b+c+d);
    }
}
