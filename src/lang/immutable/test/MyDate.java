package lang.immutable.test;

public class MyDate {
    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate setYear(int year) {
        return new MyDate(year, this.month, this.day);
    }
    public MyDate setMonth(int month) {
        return new MyDate(this.year, month, this.day);
    }
    public MyDate setDay(int day) {
        return new MyDate(this.year, this.month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

