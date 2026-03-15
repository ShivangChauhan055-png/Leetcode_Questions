package Math;

// Ques1344.java
// Problem: LeetCode 1344 - Angle Between Hands of a Clock

/*
Idea simple hai bhai:

Clock ka total circle = 360°

Minute hand:
60 minutes me 360° ghoomta hai
toh 1 minute = 360/60 = 6°

Hour hand:
12 hours me 360° ghoomta hai
toh 1 hour = 360/12 = 30°

Lekin hour hand ek jagah fixed nahi rehta,
wo minutes ke sath thoda-thoda move karta hai.

1 hour = 60 minutes
30° / 60 = 0.5°

Matlab:
1 minute me hour hand = 0.5° move karega.

Steps:

1. Minute hand ka angle nikalo
   minuteAngle = minutes × 6

2. Hour hand ka angle nikalo
   hourAngle = hour × 30 + minutes × 0.5

3. Dono ka difference nikalo
   angle = |hourAngle - minuteAngle|

4. Clock me do angle banenge
   ek direct aur ek bada wala
   isliye minimum lena padega

   answer = min(angle , 360 - angle)

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Ques1344 {

    public double angleClock(int hour, int minutes) {
        // minute hand ka angle
        double min_angle = minutes * 6;
        // hour hand ka angle
        double hour_angle = hour * 30 + minutes * 0.5;
        // dono ka difference
        double angle = Math.abs(hour_angle - min_angle);
        // minimum angle return karna hai
        double ans = Math.min(angle, 360 - angle);
        return ans;
    }
}
