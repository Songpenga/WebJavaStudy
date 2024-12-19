package Method;

/*
* * * * 자바는 항상 변수의 값을 복사해서 대입한다.
* * * * num1이라는 변수 자체가 num2에 들어가는 것이 아니다.
* * * * num1에 들어있는 값을 읽고 복사해서 num2에 넣는 것이다.
* */

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1.호출전, num1:" + num1);
        num1 = changeNumber(num1);
        System.out.println("2.호출후, num1:" + num1);
    }

    public static int changeNumber(int num2){
        num2 = num2 * 2;
        return num2;
    }

}
