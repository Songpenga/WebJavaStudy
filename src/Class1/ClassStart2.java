package Class1;

/*
* 사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶는 것이다.
* */
public class ClassStart2 {
    public static void main(String[] args){
        String[] StudentNms = {"학생1", "학생2"};
        int[] stu_ages = {15, 17};
        int[] stu_gras = {90, 95};

        for (int i = 0; i < StudentNms.length; i++){
            System.out.println("이름 : " + StudentNms[i] + " 나이 : " + stu_ages[i] + " 성적 : " + stu_gras[i]);
        }

    }
}
