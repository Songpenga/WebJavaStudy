package section8.nested.nested.ex1;

public class Network {
    //text 를 입력 받아서 NetworkMessage 를 생성하고 출력하는 단순한 기능을 제공한다.
    public void sendMessage(String txt){
        NetworkMessage networkMessage = new NetworkMessage(txt);
        networkMessage.print();
    }
}
