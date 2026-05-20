package Arrays;

class Ques2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        // brtue force tc -->O(n*n)
        /*
        approach -- two boolean array bnaege A and B ke liye and check kr le ki element
        unn dono m h ya nhi and ek count variable se update krte jaege
        last m ek ans array bnake ke ans[i]=count kr dege
        */
        // int n = A.length;
        // int[] ans = new int[n];
        // boolean[] isPresentA = new boolean[n+1];
        // boolean[] isPresentB = new boolean[n+1];
        // for(int i=0;i<n;i++){
        //     isPresentA[A[i]] = true;
        //     isPresentB[B[i]] = true; // by default present h
        //     int count =0;
        //     for(int ele = 1;ele<=n ; ele++){
        //         if(isPresentA[ele]==true && isPresentB[ele]==true) count++;
        //     }
        //     ans[i]= count;
        // }
        // return ans;

        // optimized one tc --> O(n)
        /*
        approach dekho agr common ele nikalne h to max freq 2 to hogi hi
        to first freq array bano dono A and B ki freq store kra lo then freq==2 hi count++
        krke ans array m daal do
        */
        int n = A.length;
        int[] ans = new int[n];
        int[] freq = new int[n+1];
        int count =0;
        for(int i=0;i<n;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2) count++;
            freq[B[i]]++;
            if(freq[B[i]]==2) count++;

            ans[i]=count;
        }
        return ans;
    }
}
