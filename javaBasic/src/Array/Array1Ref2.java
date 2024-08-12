package Array;

public class Array1Ref2 {
    //변수값 사용
    public static void main(String[] args) {

        // 1차원 배열
        /*int[] students = new int[5];*/
        /*int[] students = new int[]{90, 80, 70, 60, 50};*/
        int[] students = {90, 80, 70, 60, 50};

        // == 오류 == //
        // int[] students;
        // students = {90, 80, 70, 60, 50};

        for(int i=0; i < students.length; i++){
            System.out.println(i + " : " + students[i]);
        }
    }
}


/* 리팩토링 : 기능은 똑같은데, 코드를 개선하는 것 */
