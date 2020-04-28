package com.company;

public class Ex09_check_for_only_digits {

    public static boolean containsOnlyDigits(String str) {
        for(int i = 0;i<str.length();i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "44576";
        containsOnlyDigits(str);
    }
}
