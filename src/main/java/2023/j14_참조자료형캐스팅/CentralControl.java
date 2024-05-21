package j14_참조자료형캐스팅;

/*
* 중앙제어
* */
public class CentralControl {
}
    /*
    private Power device1;
    private Power device2;
    private Power device3;
    */
/*
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {
        int emptyIndex = checkEmpty();
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다");
    }

/*
    private int checkEmpty() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i; //빈공간 찾기
            }
        }
            }
    //java: missing return statement
    public void powerOn(){

        for(int i = 0; i < deviceArray.length; i++){
            deviceArray[i].on();
        }
        //      device1.on();
        // device2.on();
        //   device3.on();

    }
}



/*
// 이 구조를 배열로 만들기
   public CentralControl(Power device1, Power device2, Power device3) {
       this.device1 = device1;
       this.device2 = device2;
       this.device3 = device3;
   }
*/

/*


    public void powerOff(){
//        device1.off();
//        device2.off();
//        device3.off();

    }

    public CentralControl(Power computerPower, Power ledPower, Power speakerPower) {
        this.computerPower = computerPower;
        this.ledPower = ledPower;
        this.speakerPower = speakerPower;
    }

    public void powerOn(){
        computerPower.on();
        ledPower.on();
        speakerPower.on();
    }

    public void powerOff(){
        computerPower.off();
        ledPower.off();
        speakerPower.off();

    }


*/