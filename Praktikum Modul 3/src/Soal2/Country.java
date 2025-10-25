package Soal2;

public class Country {
    private String name, government, leader;
    private int day, month, year;

    public Country (String name, String government, String leader) {
        this.name = name;
        this.government = government;
        this.leader = leader;
    }

    public Country (String name, String government, String leader, int day, int month, int year) {
        this.name = name;
        this.government = government;
        this.leader = leader;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getGovernment() {
        return government;
    }

    public String getLeader() {
        return leader;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
