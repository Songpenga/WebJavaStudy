package j13_추상화.추상클래스.인터페이스;

public class VolumeUpBotton extends Button { // interface -> implements

    public void onPressed(){
        System.out.println("음량을 한칸 올립니다.");
    }

    public void onDown(){
        System.out.println("음량을 계속 올립니다..");
    }

}
