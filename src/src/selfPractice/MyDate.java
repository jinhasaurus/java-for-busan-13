package src.selfPractice;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid() {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12: {
                if (day >= 1 && day <= 31) {
                    System.out.println("유효한 날짜입니다");
                    return true;
                } else {
                    System.out.println("유효하지 않은 날짜입니다");
                    return false;
                }
            }
            case 4, 6, 9, 11: {
                if (day >= 1 && day <= 30) {
                    System.out.println("유효한 날짜입니다");
                    return true;
                } else {
                    System.out.println("유효하지 않은 날짜입니다");
                    return false;
                }
            }
            case 2: {
                if (day >= 1 && day <= 28) {
                    System.out.println("유효한 날짜입니다");
                    return true;
                } else {
                    System.out.println("유효하지 않은 날짜입니다");
                    return false;
                }
            }
            default: {
                System.out.println("유효하지 않은 날짜입니다.");
                return false;
            }
        }
    }
}
