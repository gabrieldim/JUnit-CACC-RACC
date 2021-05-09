public class DifferenceBetweenDaysInYear {
    /**
     * @param month1
     * @param day1
     * @param month2
     * @param day2
     * @param year
     * @return the number of days between the two given days in the same year
     *
     * preconditions: day1 and day2 must be in same year
     * 1 <= month1, month2 <= 12
     * 1 <= day1, day2 <= 31
     * month1 <= month2
     * The range for year: 1 ... 10000
     */
    public static int cal(int month1, int day1, int month2, int day2, int year) {
        int numDays;
        if (month2 == month1)
            numDays = day2 - day1;
        else {
            int daysIn[] = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int m4 = year % 4;
            int m100 = year % 100;
            int m400 = year % 400;
            if ((m4 != 0) || ((m100 == 0) && (m400 != 0)))
                daysIn[2] = 28;
            else
                daysIn[2] = 29;
            numDays = day2 + (daysIn[month1] - day1);
            for (int i = month1 + 1; i <= month2 - 1; i++)
                numDays = daysIn[i] + numDays;
        }
        return (numDays);
    }

}
