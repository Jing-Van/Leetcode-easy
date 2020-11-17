

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n=arr.size();
    // Write your code here
        int count1=0;
        int count2=0;
        for(int i = 0;i<n;i++){
            count1+=arr[i][i];
            count2+=arr[i][n-1-i];
        }
        return Math.abs(count1-count2);
    }
     

    -> arr.get(i).get(i)
   // for list; 
