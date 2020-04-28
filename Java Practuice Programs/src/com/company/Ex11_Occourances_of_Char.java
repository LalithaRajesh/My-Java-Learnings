package com.company;

public class Ex11_Occourances_of_Char {
    
    public static int countChar(String str, char ch) {
        int count = 0;
        while (str.indexOf(ch) != -1) {
            count++;
            str = str.substring(str.indexOf(ch) + 1);

        }
        return count;
    }
    public static void FrequCount(String str) {
        str = "ghggffufdfduyhgfcj";
        str = str.replace(" ", "");
        while(str.length() > 0) {
            char ch = str.charAt(0);
            System.out.println(ch + " " +countChar(str, ch));
            str = str.replace("" + ch, "");
        }

    }
}
