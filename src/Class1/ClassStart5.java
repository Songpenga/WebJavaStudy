package Class1;

public class ClassStart5 {
    /*자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.*/
    public static void main(String[] args){

        Student stu1 = new Student();
        stu1.name = "학생1";
        stu1.age = 17;
        stu1.grade = 91;


        Student stu2 = new Student();
        stu2.name = "학생2";
        stu2.age = 16;
        stu2.grade = 82;

        Student[] students = new Student[]{stu1, stu2};

        /*System.out.println("0 : " + students[0]);
        System.out.println("1 : " + students[1]);*/

/*
        for(int i = 0; i < students.length; i++){
            System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
        }
*/

        for(int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }

        for (Student s : students){ // iter
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade+"   A");
        }

/*        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);*/


    }
}
