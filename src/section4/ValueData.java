package section4;

public class ValueData {
    int val;

    //여기서 만드는 add() 메서드에는 static 키워드를 사용하지 않는다.
    //메서드는 객체를 생성해야 호출할 수있다.
    //그런데 static이 붙으면 객체를 생성하지 않고도 메서드를 호출할 수 있다.
    void add(){
        val++;
        System.out.println("value = " + val);
    }
}
