package j09__클래스.Student;

public class Student {
    /*
     Properties(속성) - (멤버)변수
     function(기능) - (멤버)메소드
     - increaseStudentYear : 호출시에 현재학년을 1학년 증가(최대 5학년)
     - showStudentinfo() : 학생정보 출력
    */

    String schoolName;
    int studentCode;
    int studentYear;
    String Name;

    void increaseStudentYear() {
        studentYear++;
        if (studentYear > 5) {
            System.out.println("더이상 학년을 증가시킬 수 없습니다.");
            System.out.println();
            studentYear--;
            return;
        }
        showStudentinfo();
    }

    void increaseStudentYear(int year) {//매개변수를 넣어
        studentYear += year;
        if(studentYear > 5) {
            System.out.println(year + "학년을 더하면 " + studentYear + "학년이 되어서 5학년을 넘어섭니다.");
            System.out.println();
            studentYear -= year;
            return;
        }
        showStudentinfo();

    }    //호출시에 현재학년을 1학년 증가(최대 5학년)


    void showStudentinfo() {
        System.out.println(schoolName);
        System.out.println(studentCode);
        System.out.println(studentYear);
        System.out.println(Name);
        System.out.println();
    }


}
