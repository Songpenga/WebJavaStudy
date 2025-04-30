package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        //생성
        Instant now = Instant.now(); //UTC 기준
        System.out.println("now = " + now);
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);
        Instant epochStart = Instant.ofEpochSecond(0); System.out.println("epochStart = " + epochStart);

        //계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}

    /*
    * 생성
    * now() : UTC를 기준 현재 시간의 Instant 를 생성한다.
    * from() : 다른 타입의 날짜와 시간을 기준으로 Instant 를 생성한다. 참고로 Instant 는 UTC를 기준으로
    * 하기 때문에 시간대 정보가 필요하다. 따라서 LocalDateTime 은 사용할 수 없다.
    * ofEpochSecond() : 에포크 시간을 기준으로 Instant 를 생성한다. 0초를 선택하면 에포크 시간인 1970년
    * 1월 1일 0시 0분 0초로 생성된다.
    * 계산
    * plusSeconds() : 초를 더한다. 초, 밀리초, 나노초 정도만 더하는 간단한 메서드가 제공된다.
    *
    * 조회
    * getEpochSecond() : 에포크 시간인 UTC 1970년 1월 1일 0시 0분 0초를 기준으로 흐른 초를 반환한다.
    * 여기서는 앞서 에포크 시간에 3600초를 더했기 때문에 3600이 반환된다.
     */
//    * Instant 정리
//    * 조금 특별한 시간, 기계 중심, UTC 기준에포크 시간으로부터 흐른 시간을 초 단위로 저장
//    * 전세계 모든 서버 시간을 똑같이 맞출 수 있음, 항상 UTC 기준이므로 한국에 있는 Instant , 미국에 있는
//    * Instant 의 시간이 똑같음
//    * 서버 로그, epoch 시간 기반 계산이 필요할 때, 간단히 두 시간의 차이를 구할 때
//    * 단점: 초 단위의 간단한 연산 가능, 복잡한 연산 못함
//    * 대안: 날짜 계산 필요하면 LocalDateTime 또는, ZonedDateTime 사용
