package com.example.assignmenttwo;

import java.util.Arrays;
import java.util.List;

public class MyWeek {
    private String name = "";

    public MyWeek() {
    }

    public enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return "A description of how the week usually goes for " + name;
    }

    public int getNumberDays() {
        return 7;
    }

    public List<Day> getWorkingDays() {
        return Arrays.asList(Day.MONDAY, Day.TUESDAY, Day.THURSDAY, Day.FRIDAY);
    }

    public String getWorkingDaysFormatted() {
        List<Day> days = getWorkingDays();
        String output = days.toString().replace("[", "").replace("]","").trim();
        return output;
    }

    public int getNumberWorkingDays() {
        return this.getWorkingDays().size();
    }

    public int getNumberNotWorkingDays() {
        return this.getNumberDays() - this.getNumberWorkingDays();
    }

    public double getPercentageWorking() {
        return (double) this.getNumberWorkingDays() / (double)this.getNumberDays() *100;
    }

    public String getOutput() {
        String output = "";
        if(getPercentageWorking() > 50){
            output = "This is not ideal :(";
        }
        else {
            output = "This is okay I guess :)";
        }
        return output;
    }
}
