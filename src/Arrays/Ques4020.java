package Arrays;

class Ques4020 {
    public int elevatorRequests(int n, int[] requests) {
        int c= 0 ,t = 0;
        for(int i=0;i<requests.length;i++){
            t += Math.abs(requests[i]-c);
            c = requests[i];
        }
        return t;
    }
}
