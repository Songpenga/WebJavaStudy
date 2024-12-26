package Class1;

/*
* 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다.
이 설계도가 바로 클래스이다.
설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.
* 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
*
클래스는 설계도이도, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체
* 또는 인스턴스라 한다. 둘다 같은 의미로 사용된다.
* 여기서는 학생(Student) 클래스를 기반으로 학생1(stu1), 학생2(stu2) 객체 또는 인스턴스를 만들었다.
*  */
/*
* 클래스를 통해 생성한 객체를 사용하려면 먼저 메모리에 존재하는 객체에 접근해야한다.
* 객체에 접근하려면 .을 이용하면 된다.
* */
public class ClassStart3 {
    public static void main(String[] args){

        Student stu1 = new Student();
        stu1.name = "학생1";
        stu1.age = 17;
        stu1.grade = 90;


        Student stu2 = new Student();
        stu2.name = "학생2";
        stu2.age = 25;
        stu2.grade = 95;

        System.out.println("이름 : " + stu1.name + " 나이 : " + stu1.age + " 성적 : " + stu1.grade);
        System.out.println("이름 : " + stu2.name + " 나이 : " + stu2.age + " 성적 : " + stu2.grade);


    }
}
