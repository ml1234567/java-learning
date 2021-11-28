package javatest;

import java.time.Duration;
import java.time.LocalDateTime;

public class Period {
    public static void main(String[] args) {
        duration();
    }
    public static void duration(){
        LocalDateTime di=LocalDateTime.of(1998,11,18,6,56,56);
        LocalDateTime di1=LocalDateTime.now();
        Duration dur= Duration.between(di,di1);
        long minutes=dur.toMinutes();
        System.out.println(minutes+"分钟");
        int days= (int) dur.toDays();
        System.out.println(days+"天");
        int years= (int) dur.toHours();
        System.out.println(years+"小时");
    }
}
