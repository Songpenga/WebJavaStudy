package section2;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview holiday = new MovieReview();
        holiday.title = "홀리데이";
        holiday.review = "즐겁게, 긍정적이게";

        MovieReview harryPoter = new MovieReview();
        harryPoter.title = "해리포터";
        harryPoter.review = "해리포터는 재밌어, 나는 래번클로";

        System.out.println("제목 : " + holiday.title + " 리뷰 : " + holiday.review);
        System.out.println("제목 : " + harryPoter.title + " 리뷰 : " + harryPoter.review);
    }
}
