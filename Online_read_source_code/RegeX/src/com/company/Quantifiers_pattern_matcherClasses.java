package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers_pattern_matcherClasses {

    public static void main(String[] args) {

        String thirdVariable = "acbhsssghkj556567acbhsssghhgkjhhhjhkjx";
        System.out.println(thirdVariable.replaceAll("acbhs{3}", "YYY"));
        System.out.println(thirdVariable.replaceAll("^acbhs{3}", "YYY"));
        System.out.println(thirdVariable.replaceAll("^acbhs+", "YYY"));
        System.out.println(thirdVariable.replaceAll("^acbhs*", "YYY"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph</p>");
        htmlText.append("<p>This is a 2nd paragraph</p>");
        htmlText.append("<h2>summary</h2>");
        htmlText.append("<p>Here is a summary paragraph</p>");

        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurance " + count + " : " + matcher.matches() + " to " + matcher.end());

        }

        String h2GroupPattern = "(<h2>.*</h2)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Occurance: " + groupMatcher.group(1));
        }
    }

}
