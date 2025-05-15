package section8.nested.nested.ex2;

//정적 중첩 클래스로 리팩토링 후
public class Network {
/*
    NetworkMessage 클래스를 Network 클래스 안에 중첩해서 만들었다.
    NetworkMessage 의 접근 제어자를 private 설정했다. 따라서 외부에서 NetworkMessage 에 접근할 수없다.
    예) new Network.NetworkMessage() 처럼 접근할 수 없다.
*/
    public void sendMessage(String txt){
        NetworkMessage networkMessage = new NetworkMessage(txt);
        networkMessage.print();
    }

    private static class NetworkMessage{
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print(){
            System.out.println("content ::: " + content);
        }
    }
}
