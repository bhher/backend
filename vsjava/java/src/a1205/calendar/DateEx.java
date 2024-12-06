package a1205.calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();  // 현재 날짜와 시간
        System.out.println("기본 ISO 형식: " + now);  // 2023-12-03T15:30:00

        // 커스텀 포맷
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("포맷팅된 날짜: " + formattedDate);
    }
}
