package section5.Ex;

public class Book {
    String title = "";
    String author = "";
    int page = 0;

    Book(){
        this("", "", 0);
    }
    Book(String title, String author){
        this(title, author, 0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = 0;
    }



    public void displayInfo(){

        System.out.println("display book INFO MAIN");
        System.out.println("제목 : " + this.title + ", 작가  : " + this.author + ", 페이지 : " + this.page);
    }


    /////////////////////////////////////////////
    //.. recursive constructor invocation 오류는 자바(Java)에서 생성자가 자기 자신을 호출하거나,
    // 생성자 호출이 서로 순환 참조를 하면서 무한 루프에 빠질 때 발생합니다. 예를 들어, 다음과 같은 코드에서 나타납니다
    // 서로를 계속 호출하게 되어 무한 루프가 발생하고,
    // 컴파일러는 이를 감지해 recursive constructor invocation 오류를 발생시킵니다
    // 생성자 호출이 순환되지 않도록 수정합니다.
    // 생성자 내부에서 자신의 클래스의 다른 생성자를 호출할 때는 꼭 종료 조건이 필요합니다.





}
