//https://www.programmersought.com/article/37655207293/

class Solution {
    int max = 0;
    public int maxLength(List<String> arr) {      
        List<Integer> list = new LinkedList<Integer>();       
        for(String a: arr){
            int curMask = 0;
            for(int i = 0; i < a.length(); i++){             
                curMask = curMask | (1 << a.charAt(i) -'a');                
            } 
            /* 
                Input
                ["yy","bkhwmpbiisbldzknpm"]
                Output
                13
                Expected
                0
                if no below block
                bb ducplicate already
                'a'-'a' is okay, since 1<<0 meaning 1
            */
            if(Integer.bitCount(curMask) != a.length())
                continue;
            list.add(curMask);
        }
        helper(list, 0, 0);
        return max;
    }
    
    // list has String without duplicates
    // 
    public void helper(List<Integer> list, int n, int mask){                       
        int count = Integer.bitCount(mask);
        max = Math.max(count, max);
        for(int i = n; i < list.size(); i++){    
            if((mask & list.get(i)) == 0)
            {
               helper(list, i + 1, mask | list.get(i));
            }                          
        }   
    }
}