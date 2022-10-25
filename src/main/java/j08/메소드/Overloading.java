package j08.메소드;
//1025-1
public class Overloading {
/*
* 메소드 오버로딩
* 매개변수의 형태가 다르면 동일한
* 메소드 명을 가지고 있을 수 있다.
* */
    public static void add(){
        System.out.println("add()");
    }

    public static void add(int a){ // 동작이 같더라도 같은 함수명을 쓸 수 없다.
        //매개변수 값이 다르면 같은 함수명을 쓸 수 있다. -> 동작이 다르니까
        System.out.println("add(int a)");

    }

    public static void add(String s){
        System.out.println("add(String s)");
    }

    public static void add(String a, int b){
        System.out.println("add(String a, int b)");
    }

    public static void main(String[] args) {

        add();
        add(1);
        add("s");
        add("20", 20);
    }
}
