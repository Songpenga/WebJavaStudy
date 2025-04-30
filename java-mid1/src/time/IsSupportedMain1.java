package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
    }

//    Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: SecondOfMinute
//    at java.base/java.time.LocalDate.get0(LocalDate.java:698)
//    at java.base/java.time.LocalDate.get(LocalDate.java:641)
//    at time.IsSupportedMain1.main(IsSupportedMain1.java:9)
//    ______________________________________________________________________________

//    이 오류는 LocalDate 객체에서 ChronoField.SECOND_OF_MINUTE 필드를 가져오려고 해서 발생한 것입니다.
//
//    핵심 원인:
//    LocalDate는 날짜(연, 월, 일) 정보만 가지고 있고, 시간(시, 분, 초) 정보는 포함하지 않습니다.
//    그런데 ChronoField.SECOND_OF_MINUTE는 "몇 초인지", 즉 시간 정보를 필요로 하기 때문에, LocalDate에서 이 필드를 요청하면 지원하지 않는다고 예외를 던집니다.
//
//    예외 메시지 분석:
//    java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: SecondOfMinute
//    UnsupportedTemporalTypeException → 해당 필드는 사용 중인 타입(LocalDate)에서 지원하지 않는다는 뜻입니다.
//
//    SecondOfMinute → 초 정보는 LocalDate에는 없음.
}
