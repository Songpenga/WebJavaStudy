package section7;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUP();
        speaker.showVolume();

        speaker.volumeUP();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200; << 오류
        speaker.showVolume();
    }
}
