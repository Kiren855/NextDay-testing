package org.example;

public class NextDay {
    public static int[] CalculateNextDay(int d, int m, int y) {
        boolean leapYear = (y % 4 == 0) && (y % 100 != 0 || y % 400 == 0);
        int[] daysInMonth = {31, leapYear ? 29 : 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};

        if (m < 1 || m > 12 || d < 1 || d > daysInMonth[m - 1] || y < 1) {
            throw new IllegalArgumentException("Ngày hoặc tháng không hợp lệ");
        }
        int nextD, nextM, nextY;
        if (d < daysInMonth[m - 1]) {
            nextD = d + 1;
            nextM = m;
            nextY = y;
        } else {
            nextD = 1;
            if (m < 12) {
                nextM = m + 1;
                nextY = y;
            } else {
                nextM = 1;
                nextY = y + 1;
            }
        }
        return new int[]{nextD, nextM, nextY};
    }
}
