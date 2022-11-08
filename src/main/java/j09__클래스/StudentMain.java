package j09__클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student S  = new Student();


        S.schoolName = "부산대학교";
        S.studentCode = 20220001;
        S.studentYear = 2;
        S.Name = "김준일";

        S.increaseStudentYear(3);
        S.increaseStudentYear(3);
        S.increaseStudentYear(3);

        System.out.println(S.studentYear);

        S.showStudentinfo(); //java: 'void' type not allowed here
/*

        for (int i = 0; i < 10; i++) {
            S.showStudentinfo();
        }
        S.showStudentinfo(); //java: 'void' type not allowed here
        //변수를 주지 않으면 그대로 호출해올 수 있다.
        */

    }

}
