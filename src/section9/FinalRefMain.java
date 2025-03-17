package section9;

//final 변수와 참조
public class FinalRefMain {
    /*
    * final을 기본형 변수에 사용하면 값을 변경할 수 없다.
    * final을 참조형 변수에 사용하면 참조값을 변경할 수 없다.
    */
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //Cannot assign a value to final variable 'data'

        //참조 대상의 값은 변경 가능
        data.val = 10;
        System.out.println(data.val);
        data.val = 20;
        System.out.println(data.val);
    }
}
