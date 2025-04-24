package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] randomNumbers;
    private int cnt = 0;

    public int[] generate(){
        randomNumbers = new int[6];
        cnt = 0;

        while (cnt < 6){
            int number = random.nextInt(45)+1;

            //중복되지 않게
            if(unique(number)){
                randomNumbers[cnt] = number;
                cnt++;
            }
        }

        return randomNumbers;
    }

    private boolean unique(int n){
        for(int i = 0; i < cnt; i++){
            if(randomNumbers[i] == n){
                return false;
            }
        }
        return true;
    }
}
