package j15_Object클래스;

public class ToString {

    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest();

        System.out.println(objectTest);
        System.out.println(objectTest.toString());

        // String str = objectTest; 사용x
        String str = objectTest.toString();
        System.out.println(str);

        Teacher teacher1 = new Teacher("peng", "남극");
        Teacher teacher2 = new Teacher("peng", "it");

        System.out.println(teacher1);
        System.out.println(teacher2);


    }
}
