package section7.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
    
    //'section7.a.PublicClass.this' cannot be referenced from a static context
}

//'section7.a.PublicClass.this' cannot be referenced from a static context
// 이 부분 설명 자세히 듣기
class DefaultClass1{}
class DefaultClass2{}