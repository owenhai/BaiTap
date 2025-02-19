
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

    public int getHour()
    {
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
        this.second++;
        if (this.second == 60)
        {
            this.second = 00;
            this.minute++;
            if (this.minute == 60)
            {
                this.minute = 00;
                this.hour++;
                if (this.hour == 24)
                {
                    this.hour = 00;
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

}