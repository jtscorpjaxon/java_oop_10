public class MyTime {
    int hour = 0;
    int minute = 0;
    int second = 0;

    public MyTime(int hour, int minute, int second) {
        checkTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime() {
    }

    public void setTime(int hour, int minute, int second) {
        checkTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void checkTime(int hour, int minute, int second) {
        if (!(hour >= 0 && hour <= 23)) {
            System.out.println("Soat natog'ri 0-23");
            System.exit(500);
        }
        if (!(minute >= 0 && minute <= 59)) {
            System.out.println("Daqiqa natog'ri 0-59");
            System.exit(500);
        }
        if (!(second >= 0 && second <= 59)) {
            System.out.println("Sekund natog'ri 0-59");
            System.exit(500);
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        checkTime(hour, this.minute, second);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        checkTime(hour, minute, second);
        this.minute = minute;
    }

    public void setSecond(int second) {
        checkTime(hour, minute, second);
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void nextSecond() {
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                minute = 0;
                if (hour == 23) {
                    hour = 0;
                } else {
                    hour++;
                }
            } else {
                minute++;
            }
        } else
            second++;
    }

    public void nextMinute() {
        if (minute == 59) {
            minute = 0;
            if (hour == 23) {
                hour = 0;
            } else {
                hour++;
            }
        } else
            minute++;
    }
    public void nextHour() {
        if (hour == 23)
            hour = 0;
        else
            hour++;
    }

    public void previousSecond() {
        if (second == 0) {
            second = 59;
            if (minute == 0) {
                minute = 59;
                if (hour == 0) {
                    hour = 23;
                } else {
                    hour--;
                }
            } else {
                minute--;
            }
        } else
            second--;
    }
    public void previousMinute() {
        if (minute == 0) {
            minute = 59;
            if (hour == 0) {
                hour = 23;
            } else {
                hour--;
            }
        } else
            minute--;
    }
    public void previousHour() {
        if (hour == 0)
            hour = 23;
        else
            hour--;
    }

}
