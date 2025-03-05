package section7.Ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        if(count >= max){
            System.out.println("max값을 초과할 수 없습니다");
        }else{
            count++;
            System.out.println(count);
        }

/*        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;*/
    }

    //지금까지 증가한 값을 반환
    public int getCount(){
        return count;
    }
}
