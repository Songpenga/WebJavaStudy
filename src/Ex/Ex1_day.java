package Ex;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex1_day {
    public static void main(String[] args) throws Exception  {
        String date = "20180910";
        String result = addDate(date,1,12,1);
        System.out.println(result);

    }


    /**
     * 년 월 일 날짜 더하기
     *
     * @param dt(날짜) , y(년) , m(월), d(일)
     * @Exam  addDate("20180910",1,12,1) -->20200911
     * @return String
     */
    private static String addDate(String dt, int y, int m, int d) throws Exception  {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        Calendar cal = Calendar.getInstance();
        Date date = format.parse(dt);
        cal.setTime(date);
        cal.add(Calendar.YEAR, y);		//년 더하기
        cal.add(Calendar.MONTH, m);		//년 더하기
        cal.add(Calendar.DATE, d);		//년 더하기

        return format.format(cal.getTime());

    }
    //출처: https://javacpro.tistory.com/67?category=104804 [버물리의 IT공부:티스토리]
}
