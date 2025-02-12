package section3;

public class Method1 {

    public static void main(String[] args) {
        Student stu1 = new Student();
        initStu(stu1, "t1", 28, 90 );

        Student stu2 = new Student();
        initStu(stu2, "t3", 21, 55 );

        printStu(stu1);
        printStu(stu2);
    }

    static void initStu(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStu(Student student){
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
