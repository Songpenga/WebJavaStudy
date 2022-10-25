package j04_연산자;

public class operation5 {
    public static void main(String[] args) {
        int totalCount = 202;
        int maxPage = totalCount % 10 == 0 ? totalCount / 10 : totalCount / 10 + 1 ; // 마지막 페이지 번호
        int page = 15;

        int startIndex = page % 5 == 0 ? page - 4 : (page % 5) + 1;
        int endIndex = startIndex + 4 <= maxPage ? startIndex + 4 : maxPage;


        System.out.println("page: " + page);
        System.out.println("startIndex: " + startIndex);
        System.out.println("endIndex: " + endIndex);

        String isMaxPageStr = page == endIndex ? "마지막 페이지입니다." : "마지막 페이지가 아닙니다." ;
        System.out.println("isMaxPageStr: " + isMaxPageStr);

    }
}
