package parcial_1;

import java.util.concurrent.TimeUnit;

public class Chronometer {
  public static void main(String[] args) {
    int hours = 0;

    try {
      while (true) {
        for (int minutes = 0; minutes < 60; minutes++) {
          for (int seconds = 0; seconds < 60; seconds++) {
            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
            TimeUnit.SECONDS.sleep(1);
          }
        }
        hours += 1;
      }
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
