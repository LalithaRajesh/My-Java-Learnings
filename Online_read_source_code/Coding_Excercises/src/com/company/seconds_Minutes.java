package com.company;

public class seconds_Minutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3678));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }
    private static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hourString = hour + "h";
        if(hour < 10) {
            hourString = "0" + hourString;
        }
        String minuteString = minutes + "m";
        if(remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }
        String secondsStrings = seconds + "s";
        if(seconds < 10) {
            secondsStrings = "0" + secondsStrings;
        }

        return hourString + " " + minuteString + " "+ secondsStrings +" ";
    }

    private static String getDurationString(int seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
