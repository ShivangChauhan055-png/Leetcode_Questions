package String;

class Ques796 {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String combine = s+s;
        return combine.contains(goal); // trick h ye h ek string to 2 baar concate kr do
        // agr dusri string usme hui to true h otherwise false h
    }
}
