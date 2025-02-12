package section3;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();

        System.out.println("bigdata count = " + bigData.count);
        System.out.println("bigdata data = " + bigData.data);

        //NullPointerException -> 이 문제를 해결하려면 Data 인스턴스를 만들고
        // BigData.data 멤버변수에 참조값을 할당하면 된다.
        System.out.println("bigdata data.value = " + bigData.data.value);
    }
}
