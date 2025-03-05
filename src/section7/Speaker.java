package section7;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUP(){
        if(volume >= 100){
            System.out.println("최대 음량 입니다.");
        }else{
            volume += 10;
            System.out.println("음량을 올립니다.");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDOWN");
    }

    void showVolume(){
        System.out.println("현재음량 : " + volume);
    }
}
