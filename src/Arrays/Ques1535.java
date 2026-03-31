package Arrays;

// Ques1535.java
// Problem: Find the Winner of an Array Game
class Ques1535 {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        // starting me first element hi current winner hai
        int player = arr[0];
        // kitni baar continuously jeeta hai
        int win = 0;
        // baaki elements ke saath compare karte jao
        for(int i = 1; i < n; i++){
            // agar current player bada hai → win++
            if(player > arr[i]){
                win++;
            }
            else{
                // naya player aa gaya (bada element)
                player = arr[i];
                win = 1;
            }
            // agar kisi ne k baar jeet liya → wahi winner
            if(win == k){
                return player;
            }
        }
        // agar koi k tak nahi pahucha → max element hi winner hoga
        return player;
    }
}


