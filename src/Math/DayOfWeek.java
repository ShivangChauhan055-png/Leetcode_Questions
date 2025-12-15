package Math;

/*
========================================================
GFG Ques: Find the Day of the Week for a Given Date
========================================================

Problem:
Given a date (day, month, year), find which day of the week
(Monday, Tuesday, etc.) it was or will be.

--------------------------------------------------------
IMPORTANT POINTS:
--------------------------------------------------------
1. We must NOT use loops
2. Time Complexity should be O(1)
3. Space Complexity should be O(1)
4. The solution should work for past & future dates

--------------------------------------------------------
APPROACH USED:
--------------------------------------------------------
We use "Zeller’s Congruence" — a mathematical formula
that directly calculates the day of the week.

--------------------------------------------------------
DAY NUMBER MAPPING (Zeller’s Formula):
--------------------------------------------------------
0 -> Saturday
1 -> Sunday
2 -> Monday
3 -> Tuesday
4 -> Wednesday
5 -> Thursday
6 -> Friday
========================================================
*/

public class DayOfWeek {

    /*
    ----------------------------------------------------
    Function: getDayOfWeek
    ----------------------------------------------------
    Parameters:
    d -> day
    m -> month
    y -> year

    Returns:
    String -> Day of the week
    ----------------------------------------------------
    */
    static String getDayOfWeek(int d, int m, int y) {

        /*
        ------------------------------------------------
        STEP 1: Adjust Month and Year
        ------------------------------------------------
        Zeller’s formula considers:
        March = 3, April = 4, ... December = 12
        January = 13 (of previous year)
        February = 14 (of previous year)

        So if month is Jan or Feb:
        - Add 12 to month
        - Subtract 1 from year
        ------------------------------------------------
        */
        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }

        /*
        ------------------------------------------------
        STEP 2: Apply Zeller’s Congruence Formula
        ------------------------------------------------
        h = ( d
            + (13 * (m + 1)) / 5
            + y
            + y / 4
            - y / 100
            + y / 400 ) % 7

        The value of h will be between 0 and 6
        ------------------------------------------------
        */
        int h = (d
                + (13 * (m + 1)) / 5
                + y
                + y / 4
                - y / 100
                + y / 400) % 7;

        /*
        ------------------------------------------------
        STEP 3: Map number to day name
        ------------------------------------------------
        */
        String[] days = {
                "Saturday",  // 0
                "Sunday",    // 1
                "Monday",    // 2
                "Tuesday",   // 3
                "Wednesday", // 4
                "Thursday",  // 5
                "Friday"     // 6
        };

        /*
        ------------------------------------------------
        STEP 4: Return the day
        ------------------------------------------------
        */
        return days[h];
    }

    /*
    ----------------------------------------------------
    MAIN METHOD (For IntelliJ Testing Only)
    ----------------------------------------------------
    This is NOT required on platforms like GFG,
    but helps us test the function locally.
    ----------------------------------------------------
    */
    public static void main(String[] args) {

        // Example 1
        System.out.println(getDayOfWeek(28, 12, 1995));
        // Output: Thursday

        // Example 2
        System.out.println(getDayOfWeek(30, 8, 2010));
        // Output: Monday
    }
}

