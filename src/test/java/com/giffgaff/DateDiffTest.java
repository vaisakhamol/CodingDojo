package com.giffgaff;

import com.giffgaff.DateDiff;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vaisakh on 20/05/2016.
 */
public class DateDiffTest {

    @Test
    public void findDateDifferenceTest() {
        String startDate = "01/01/2016";
        String endDate = "02/01/2016";

        DateDiff dateDiff = new DateDiff();
        int diffDays = dateDiff.findDateDifference(startDate,endDate);

        Assert.assertEquals(1,diffDays);
    }

    @Test
    public void isLeapYearTest() {
        DateDiff dateDiff = new DateDiff();
        boolean isLeapYear = dateDiff.isLeapYear(2000);
    }
}
