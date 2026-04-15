package String;

class Ques2515 {
    /*
     * Function: closestTarget
     * ------------------------
     * Given an array of words (circular),
     * find the minimum distance from startIndex
     * to any occurrence of target.
     *
     * You can move left or right (circularly).
     * Return minimum steps, else -1 if not found.
     */
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;              // total words
        int result = Integer.MAX_VALUE;    // store minimum distance
        for(int i = 0; i < n; i++) {
            // check if current word matches target
            if(words[i].equals(target)) {
                int dis = Math.abs(i - startIndex); // direct distance
                int circular = n - dis;             // circular distance
                // take minimum of both paths
                result = Math.min(result, Math.min(dis, circular));
            }
        }
        // if not found, return -1
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
