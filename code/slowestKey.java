class Solution {
  public char slowestKey(int[] releaseTimes, String keysPressed) {
    int maxReleaseTime = 0;
    int maxReleaseTimeIdx = 0;
    for (int idx = 0; idx < releaseTimes.length; idx++) {
      int currentIdx = keysPressed.charAt(idx) - 'a';
      int currReleaseTime = releaseTimes[idx] - (idx == 0 ? 0 : releaseTimes[idx - 1]);
      if (currReleaseTime >= maxReleaseTime) {
        if (currReleaseTime > maxReleaseTime)  {
          maxReleaseTimeIdx = currentIdx;
            
        } 
          else
              // this if solved the equivalent relase time, but return 
              // lexical bigger letter 
              // cause currentIdx is calcaulted by -'a'
              if (currentIdx > maxReleaseTimeIdx) {
          maxReleaseTimeIdx = currentIdx;
        }
        maxReleaseTime = currReleaseTime;
      }
    }
    return (char) (97 + maxReleaseTimeIdx);
  }
}

// class Solution {
//     public char slowestKey(int[] releaseTimes, String keysPressed) {
//         int maxSpan=releaseTimes[0];
//         int len=releaseTimes.length;
//         Stack<Integer> stack=new Stack<Integer>();
//         int idx=-1;
//         for(int i=1;i<len;i++){
//             if(maxSpan<releaseTimes[i]-releaseTimes[i-1]){
//                 idx=i;
//             }
//             maxSpan=Math.max(maxSpan,releaseTimes[i]-releaseTimes[i-1]);
//         }
//         return keysPressed.charAt(idx);
//     }
// }