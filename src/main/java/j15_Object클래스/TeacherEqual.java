package j15_Object클래스;

public class TeacherEqual {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Peng", "코리아아이티");
        Teacher teacher2 = new Teacher("Peng", "코리아아이티");//ctrl+space

        System.out.println(teacher1 == teacher2);

    }
}
