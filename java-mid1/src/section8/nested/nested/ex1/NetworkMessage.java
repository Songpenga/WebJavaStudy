package section8.nested.nested.ex1;

public class NetworkMessage {
    private String content;

    //NetworkMessage 는 Network 객체 안에서만 사용되는 객체이다.
    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print(){
        System.out.println(content);
    }
}
