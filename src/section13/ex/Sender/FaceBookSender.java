package section13.ex.Sender;

public class FaceBookSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("DM을 발송합니다 : " + message);
    }
}
