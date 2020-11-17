/* 

There are n soldiers standing in a line.
Each soldier is assigned a unique rating value.

You have to form a team of 3 soldiers
 amongst them under the following rules:

Choose 3 soldiers with index (i, j, k) with
 rating (rating[i], rating[j], rating[k]).
A team is valid if:
  (rating[i] < rating[j] < rating[k]) or
   (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
Return the number of teams you can
 form given the conditions. (soldiers can be part of multiple teams).
https://www.youtube.com/watch?v=HrU-xrUnb8g&ab_channel=HuaHua
乘法原理 
左边取一个人，右边取一个人
相乘

1st round, 
i=0;
3 bigger on the right hand
less[1]
great[0]

0 bigger on the left hand
left * right =0;
+ 

less[0,3] i<j<k
great[0,1] i>j>k

*/

class Solution {

  public int numTeams(int[] rating) {
    int res = 0;
    for (int i = 0; i < rating.length - 1; i++) {
      int[] less = new int[2];
      int[] great = new int[2];
      for (int j = 0; j < rating.length; j++) {
        if (rating[i] < rating[j]) {
          less[i > j ? 0 : 1]++;
        }
        if (rating[i] > rating[j]) {
          great[i > j ? 0 : 1]++;
        }
      }
      res += less[0] * great[1] + less[1] * great[0];
    }
    return res;
  } 
}


