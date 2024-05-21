package j15_Object클래스;
/*
* 모든 클래스는 Object 클래스를 상속받는다.
*
* */
public class ObjectTest extends Object{ // object 기본 클래스.ctrl+더블클릭을 하면 경로를 타고 들어갈 수 있다.

    private String name;
    private String address;
//    alt + insert 로 아래 메서드 삽입.

    public ObjectTest() {
            }

    public ObjectTest(String name, String address) {

    this.name = name;
    this.address = address;
    }

    public String showInfo() {
        return "name: " + name + " address: " + address;
    }

    public String toString() {
        return "name: " + name + " address: " + address;
    }


}
