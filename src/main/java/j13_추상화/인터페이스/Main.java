package j13_추상화.인터페이스;


public class Main {
    public static void main(String[] args) {

// 켜고 끄고 켜고 끄고.
        RemoteControl remoteControl = new RemoteControl(new PowerButton(), new VolumeUpButton(), new VolumeDownButton());

        remoteControl.onPressedPowerButton();
        remoteControl.onPressedPowerButton();
        remoteControl.onPressedPowerButton();
        remoteControl.onPressedVolumeUpButton();
        remoteControl.onPressedVolumeDownButton();
        remoteControl.onDownVolumeUpButton();
        remoteControl.onDownVolumeDownButton();


    }
}
