package j10_접근지정자;

public class AcessModifierMain {
    public static void main(String[] args) {

        StudentAcessModifier sam = new StudentAcessModifier(20220001, "김준일");

        sam.showInfo();
        sam.setName("김준이");
        sam.showInfo();

        System.out.println(sam.getCode());
    }


            }

