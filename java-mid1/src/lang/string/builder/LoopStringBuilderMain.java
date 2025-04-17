package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder rslt = new StringBuilder();
        for(int i = 0; i < 100000; i++){
            rslt.append("PEng World");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result ::: " + rslt);
        System.out.println("Time ::: " + (endTime - startTime) + "ms");
    }
}
