package j15_Object클래스;
//1102-2
public class StringEquals {

    public static void main(String[] args) {

        int i = 10; //리터럴상수

        String name1 = "Peng";
        String name2 = "Peng";
        String name3 = new String("Peng"); //메모리 할당
        String name4 = new String("Peng");

        System.out.println(name1 + name2 + name3);
        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false
        System.out.println(name3 == name4); // false
//       name3,4  == 는 값을 비교하는게 아니라 주소를 비교한다.
        // name1, name2

        System.out.println(name1.equals(name3)); //문자열의 값을 비교한다.
    }
}
