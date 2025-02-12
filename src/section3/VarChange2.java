package section3;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10100;
        //Data dataB = dataA;
        Data dataB = new Data();
        dataB.value = 17545;

        System.out.println("dataA : " + dataA);
        System.out.println("dataB : " + dataB);
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);

        //dataA 변경
        dataA.value = 20200;
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);

        //dataB 변경
        dataA.value = 30300;
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);
    }
}
