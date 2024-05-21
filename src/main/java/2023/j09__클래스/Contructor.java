package j09__클래스;

public class Contructor {
    int num;
    String name;

    Contructor(){
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Contructor(int num) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로하는 생성자)");
        this.num = num; //this = 나의 주소
        //

    }

    Contructor(String name) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로하는 생성자)");

    }

    Contructor(int num, String name) {
        System.out.println("AllargsCinstructor(전체생성자)");
        this.num = num;
        this.name = name;

    }

    void showinfo(){
        System.out.println("num : " + num);
        System.out.println("name : " + name);

    }
}
