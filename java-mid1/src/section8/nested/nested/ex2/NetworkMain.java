package section8.nested.nested.ex2;

public class NetworkMain {
    /*
    ex1 패키지를 열어보면 다음 하나의 클래스가 보일 것이다. ( main 은 제외)
        Network
        Network 관련 라이브러리를 사용하기 위해서 ex2 패키지를 열어본 개발자는 해당 클래스만 확인할 것이다. 추가로
        NetworkMessage 가 중첩 클래스에 private 접근 제어자로 되어 있는 것을 보고, Network 내부에서만 단독으
        로 사용하는 클래스라고 바로 인지할 수 있다.
    */
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello peng!!");
    }
}
