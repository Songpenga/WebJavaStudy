package Method;

/*
* * * * 자바는 항상 변수의 값을 복사해서 대입한다.
* * * * num1이라는 변수 자체가 num2에 들어가는 것이 아니다.
* * * * num1에 들어있는 값을 읽고 복사해서 num2에 넣는 것이다.
* */

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1.호출전, num1:" + num1);
        changeNumber(num1);
        System.out.println("4.호출후, num1:" + num1);
    }

    public static void changeNumber(int num2){
        System.out.println("2.chargeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3.chargeNumber 변경 후, num2: " + num2);
    }

}
