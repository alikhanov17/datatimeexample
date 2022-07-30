package com.company;

import java.time.LocalDateTime;

public class Main {


        public static void main(String[] args) {
            LocalDateTime now = LocalDateTime.now();
            int year = now.getYear();
            int dayYear = now.getDayOfYear();
            int hour = now.getHour();
            int minute = now.getMinute();

            System.out.println("Year: " + year);
            System.out.println("day in year: " + dayYear);
            System.out.println("hours: " + hour);
            System.out.println("minutes: " + minute);
        }
    }
