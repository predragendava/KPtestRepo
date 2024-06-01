package com.kupujemprodajem.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonMethods {

    public static boolean izvuciBrojIProveriDaLiJeVeciOdHiljadu(String nizZnakova) {

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(nizZnakova);

        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            stringBuilder.append(matcher.group());
        }

        int number = Integer.parseInt(stringBuilder.toString());
        System.out.println("broj rezultata je: " + number);

        if (number>1000) return true;
        else return false;

    }

}
