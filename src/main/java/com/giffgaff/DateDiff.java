package com.giffgaff;

import java.util.StringTokenizer;

public class DateDiff {

    public static void main(String[] args) {

    }

    public int findDateDifference(String startDate , String endDate) {
        StringTokenizer dateTokens = new StringTokenizer(startDate,"/");
        int sNumberOfTokens  = dateTokens.countTokens();

        if(sNumberOfTokens == 3) {
            int sDay = Integer.parseInt(dateTokens.nextToken());
            int sMonth = Integer.parseInt(dateTokens.nextToken());
            int sYear = Integer.parseInt(dateTokens.nextToken());
        }

        dateTokens = new StringTokenizer(endDate,"/");

        int eNumberOfTokens  = dateTokens.countTokens();
        if(eNumberOfTokens == 3) {
            int eDay = Integer.parseInt(dateTokens.nextToken());
            int eMonth = Integer.parseInt(dateTokens.nextToken());
            int eYear = Integer.parseInt(dateTokens.nextToken());
        }

        return 1;
    }

    public boolean isLeapYear(int year) {
        return true;
    }
}
