class Solution {
  public int pseudoPalindromicPaths (TreeNode root) {
    int[] map = new int[10];
    int[] count = {0};
    pseudoPalindromicPathsUtil(root, map, count);
    return count[0];
  }
  
  // odd can only appear once
  private boolean isPalindrome(int[] map) {
    boolean oddFound = false;
    for(int i = 1; i <= 9; i++) {
      if (map[i] % 2 != 0) {
        if (oddFound) {
          return false;
        }
        oddFound = true;
      }
    }
    return true;
  }
  
  private void pseudoPalindromicPathsUtil(TreeNode root, int[] map, int[] count) {
    if (root == null) {
      return;
    }
    map[root.val] = map[root.val] + 1;
    if (root.left == null && root.right == null) {
      if (isPalindrome(map)) {
        count[0]++;
      }
    }
    pseudoPalindromicPathsUtil(root.left, map, count);
    pseudoPalindromicPathsUtil(root.right, map, count);
    // so that path can back track the path 
    // 3 1 -> null 3 -> 2 to the right path
    map[root.val] = map[root.val] - 1;
  }
}