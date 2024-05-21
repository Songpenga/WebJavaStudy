package j13_추상화.추상클래스.인터페이스;

public class RemoteControl {

    private PowerBotton powerBotton;
    private VolumeUpBotton volumeUpBotton;
    private VolumeDownBotton volumeDownBotton;


    public RemoteControl(PowerBotton powerBotton, VolumeUpBotton volumeUpBotton, VolumeDownBotton volumeDownBotton) {
        this.powerBotton = powerBotton;
        this.volumeUpBotton = volumeUpBotton;
        this.volumeDownBotton = volumeDownBotton;
    }

    public void pushPowerButton(){
        powerBotton.onPressed();
    }

    public void volumeUpBotton(){
        volumeUpBotton.onPressed();
    }

    public void volumeDownBotton(){
        volumeDownBotton.onPressed();
    }


}
