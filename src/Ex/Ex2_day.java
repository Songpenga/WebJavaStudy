package Ex;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex2_day {
    /**
     * 현재 날짜 불러오기
     * @return
     */
    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    /**
     * 현재 날짜 불러오기
     * @param pattern
     * @return
     */
    public static String getCurrentDate(String pattern) {
        return LocalDate.now().format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 현재 년도 불러오기
     * @return
     */
    public static String getCurrentYear() {
        return String.valueOf(getCurrentDate().getYear());
    }

    /**
     * 현재 월 불러오기
     * @return
     */
    public static String getCurrentMonth() {
        return String.valueOf(getCurrentDate().getMonthValue());
    }

    /**
     * 현재 일 불러오기
     * @return
     */
    public static String getCurrentDay() {
        return String.valueOf(getCurrentDate().getDayOfMonth());
    }
    //출처: https://javacpro.tistory.com/89 [버물리의 IT공부:티스토리]
}
