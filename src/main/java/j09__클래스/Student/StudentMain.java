package j09__클래스.Student;

import j09__클래스.Student.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "부산대학교";
        s1.studentCode = 20220001;
        s1.studentYear = 1;
        s1.Name = "김준일";

        s2.schoolName = "부경대학교";
        s2.studentCode = 20221001;
        s2.studentYear = 2;
        s2.Name = "김준이";

        s1.showStudentinfo();
        s2.showStudentinfo(); //java: 'void' type not allowed here
/*

//        System.out.println("<<<<<< 학년증가 반복 >>>>>>");
//        for(int i = 0; i < 10; i++) {
//            s1.increaseStudentYear();
//        }
*/

        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);

        s1.showStudentinfo();

        s2.increaseStudentYear(5);
    }


}
