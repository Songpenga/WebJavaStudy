package Array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //itar
        //iter
        for (int number : numbers) {

        }

        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            System.out.println(num);
        }

        //향상된 for 문
        for (int num : numbers){
            System.out.println(num);
        }

        /*
        * 향상된 for 문은 배열의인덱스를 사용하지 않고, 종료 조건을 주지 않아도 된다.
        * 단순히 해당 배열을 처음부터 끝까지 탐색한다.
        */

        //for - each문을 사용할 수 없는경우, 증가하는 index값 필요
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number" + i + "번의 결과는 : " + numbers[i]);

        }
    }
}
