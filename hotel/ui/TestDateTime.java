package hotel.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current date and time: " + formatter.format(now));
    }
} 