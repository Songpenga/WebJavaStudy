package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator get = new LottoGenerator();
        int[] lottoNum = get.generate();

        //생성된 로또번호 출력
        System.out.println("로또번호 : ");
        for (int i : lottoNum) {
            System.out.println(i);
        }
    }

}
