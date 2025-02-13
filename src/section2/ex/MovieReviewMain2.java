package section2.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {

        MovieReview[] reviews = new MovieReview[2];

        MovieReview holiday = new MovieReview();
        holiday.title = "홀리데이";
        holiday.review = "즐겁게, 긍정적이게";
        reviews[0] = holiday;

        MovieReview harryPoter = new MovieReview();
        harryPoter.title = "해리포터";
        harryPoter.review = "해리포터는 재밌어";
        reviews[1] = harryPoter;

        for (MovieReview review : reviews) {
            System.out.println("제목 : " + review.title + " 리뷰 : " + review.review);
        }

    }
}
