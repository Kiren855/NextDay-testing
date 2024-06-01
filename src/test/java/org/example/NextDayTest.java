package org.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

public class NextDayTest {

    private void assertNextDay(int expectedD, int expectedM, int expectedY, int inputD, int inputM, int inputY) {
        assertArrayEquals(new int[]{expectedD, expectedM, expectedY}, NextDay.CalculateNextDay(inputD, inputM, inputY));
    }

    private void assertInvalidDate(int d, int m, int y) {
        assertThrows(IllegalArgumentException.class, () -> {
            NextDay.CalculateNextDay(d, m, y);
        });
    }

    @Test
    public void testValidDates() {
        // Normal day
        assertNextDay(2, 1, 2022, 1, 1, 2022);
        // End of month
        assertNextDay(1, 2, 2022, 31, 1, 2022);
        // End of February, non-leap year
        assertNextDay(1, 3, 2022, 28, 2, 2022);
        // End of February, leap year
        assertNextDay(29, 2, 2020, 28, 2, 2020);
        assertNextDay(1, 3, 2020, 29, 2, 2020);
        // End of year
        assertNextDay(1, 1, 2023, 31, 12, 2022);
        // Leap year valid date
        assertNextDay(1, 3, 2020, 29, 2, 2020);
        // Edge case month boundary
        assertNextDay(1, 2, 2022, 31, 1, 2022);
        assertNextDay(1, 5, 2022, 30, 4, 2022);
        // Edge case year boundary
        assertNextDay(1, 1, 2023, 31, 12, 2022);
    }

    @Test
    public void testInvalidDates() {
        // Invalid date
        assertInvalidDate(32, 1, 2022);
        assertInvalidDate(30, 2, 2022);
        // Negative date
        assertInvalidDate(1, -1, 2022);
        assertInvalidDate(-1, 1, 2022);
        assertInvalidDate(1, 1, -2022);
        // Invalid leap year
        assertInvalidDate(29, 2, 2021);
        // Smallest possible invalid date
        assertInvalidDate(0, 1, 2022);
        assertInvalidDate(1, 0, 2022);
        assertInvalidDate(1, 1, 0);
    }
}