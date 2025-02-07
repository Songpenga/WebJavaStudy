package Class1;

public class ClassStart4 {
    /*자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.*/
    public static void main(String[] args){

        Student stu1 = new Student();
        stu1.name = "학생1";
        stu1.age = 17;
        stu1.grade = 90;


        Student stu2 = new Student();
        stu2.name = "학생2";
        stu2.age = 16;
        stu2.grade = 80;

        Student[] students = new Student[2];
        students[0] = stu1;
        students[1] = stu2;

        System.out.println("0 : " + students[0]);
        System.out.println("1 : " + students[1]);

        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);


    }
}
