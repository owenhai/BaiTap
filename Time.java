<<<<<<< HEAD
public class Time
{
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString()
    {
        return hour + ":" + minute + ":" + second;

    }
    public Time nextSecond()
    {
        second++;
        if (second == 60)
        {
            second = 0;
            minute++;
            if (minute == 60)
            {
                minute = 0;
                hour++;
                if (hour == 24)
                {
                    hour = 0;
                }
            }
        }
        return this;
    }
    public Time previousSecond()
    {
        this.second--;
        if (this.second == -1)
        {
            this.second = 59;
            this.minute--;
            if (this.minute == -1)
            {
                this.minute = 59;
                this.hour--;
                if (this.hour == -1)
                {
                    this.hour = 23;
                }
            }
        }
        return this;
    }
=======
public class Time
{
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString()
    {
        return hour + ":" + minute + ":" + second;

    }
    public Time nextSecond()
    {
        second++;
        if (second == 60)
        {
            second = 0;
            minute++;
            if (minute == 60)
            {
                minute = 0;
                hour++;
                if (hour == 24)
                {
                    hour = 0;
                }
            }
        }
        return this;
    }
    public Time previousSecond()
    {
        second--;
        if (second == -1)
        {
            second = 59;
            minute--;
            if (minute == -1)
            {
                minute = 59;
                hour--;
                if (hour == -1)
                {
                    hour = 23;
                }
            }
        }
        return this;
    }
>>>>>>> 735151a589353871c9dbdae0afa4cc0c0fbaf6f2
}