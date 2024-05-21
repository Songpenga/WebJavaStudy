package j13_추상화.추상클래스.인터페이스;

public class VolumeDownBotton extends Button { // interface -> implements

    @Override
    public void onPressed(){
        System.out.println("음량을 한칸 내립니다.");
    }

    public void onDown(){
        System.out.println("음량을 계속 내립니다..");
    }


}
