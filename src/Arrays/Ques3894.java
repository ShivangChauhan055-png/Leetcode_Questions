package Arrays;

// Ques3894.java
class Ques3894 {
    public String trafficSignal(int timer) {
        if (timer == 0) return "Green";
        if (timer == 30) return "Orange";
        if (timer > 30 && timer <= 90) return "Red";
        return "Invalid";
    }
}
