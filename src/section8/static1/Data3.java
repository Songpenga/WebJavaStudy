package section8.static1;

/* 250306
* 특정 클래스에서 공용으로 함께 사용 할 수 있는 변수를 만든다.
* static 키워드를 사용하면 공용으로 함께 사용하는 변수를 만들 수 있다.
* 멤버변수에 static을 붙이게 되면 static 변수, 정적 변수 또는 클래스 변수라 한다.
*/
public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
