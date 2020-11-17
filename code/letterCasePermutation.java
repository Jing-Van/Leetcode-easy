public class Solution{
    /**
     a1b2   i=0, when it's at a, since it's a letter, we have two branches: a, A
     /        \
     a1b2       A1b2 i=1 when it's at 1, we only have 1 branch which is itself
//   |          |
*//* a1b2       A1b2 i=2 when it's at b, we have two branches: b, B
     /  \        / \
     a1b2 a1B2  A1b2 A1B2 i=3  when it's at 2, we only have one branch.
     |    |     |     |
     a1b2 a1B2  A1b2  A1B2 i=4 = S.length(). End recursion, add permutation to ans.
     
     During this process, we are changing the S char array itself
     */
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, 0, S.toCharArray());
        return ans;
    }
 
     // result, when a recursive find export signal, the information needed to bring back
    public void backtrack(List<String> result, int i, char[] chars) {

        if (i == chars.length) {
            // recursive signal outlet
            result.add(new String(chars));
            // recursive exports
            return;
        }

        // chars [i] in the current space possible once or twice Sleeper (The letter signal)
        if (Character.isLetter(chars[i])) {
            // parallel to the Level 1
            chars[i] = Character.toLowerCase(chars[i]);
            backtrack (result, i + 1, chars); // space to the next level

            // Level 2 in parallel, corresponding to the next backtrack
            chars[i] = Character.toUpperCase(chars[i]);
        }

        backtrack (result, i + 1, chars); // space to the next level

    }
    

}