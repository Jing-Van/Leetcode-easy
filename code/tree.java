public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p==null && q==null){
        return true;
    }else if(p==null||q==null){
        return false;
    }
    
    if(p.val!=q.val){
        return false;
    }
    return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
}  

class Solution {
  List<String> list;
  public List<String> binaryTreePaths(TreeNode root) {
    list = new ArrayList<>();
    if (root == null) {
      return list;
    }
    helper(root, new StringBuilder());
    return list;
  }
  
  private void helper(TreeNode root, StringBuilder sb) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      sb.append(root.val);
      list.add(sb.toString());
    }
    else {
      sb.append(root.val).append("->");
      helper(root.left, new StringBuilder(sb.toString()));
      helper(root.right, new StringBuilder(sb.toString()));
    }
  }
}

class Solution {
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    return getLeafSequence(root1).equals(getLeafSequence(root2));
  }
  
  private String getLeafSequence(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    helper(root, list);
    return list.toString();
  }
  
  private void helper(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      list.add(root.val);
    }
    else {
      helper(root.left, list);
      helper(root.right, list);
    }
  }
}

// just return is fine, value saved to class variable List<String> list;
Elements of queue [0, 1, 2, 3, 4]
removed element-0
[1, 2, 3, 4]
head of queue-1
Size of queue-4
Queue<Integer> q = new LinkedList<>(); 

 */
class Solution {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    if (root == null) {
      return list;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> temp = new ArrayList<>();
      while (size-- > 0) {
        TreeNode removed = queue.remove();
        temp.add(removed.val);
        if (removed.left != null) {
          queue.add(removed.left);
        }
        if (removed.right != null) {
          queue.add(removed.right);
        }
      }
      list.add(temp);
    }
    // reverse
    Collections.reverse(list);
    return list;
  }
}

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]


    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        
        Set<Integer> set = new HashSet<>();
        int min = popStack(stack);
        set.add(min);
        
        while (!stack.isEmpty()) {
            int num = popStack(stack);
            if (set.contains(k-num)) {
                return true;
            }
            
            if (min + num > k) {
                return false;
            }
            
            set.add(num);
        }
        
        return false;
    }
    
    private int popStack(Stack<TreeNode> stack) {
        TreeNode n = stack.pop();
        TreeNode right = n.right;
        
        while (right != null) {
            stack.push(right);
            right = right.left;
        }
        
        return n.val;
    }

set.contains()

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        
        int rootDiam = depth(root.left) + depth(root.right);
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);
        
        return Math.max(rootDiam, Math.max(leftDia, rightDia));
    }
    
    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        return 1 + Math.max(depth(root.left), depth(root.right));
    }

class Solution {
    Integer prev=null;
    int count=1;
    int max=0;
    public int[] findMode(TreeNode root) {
        List<Integer> modes=new ArrayList();
        
        traverse(root, modes);
        
        int[] result=new int[modes.size()];
        for(int i=0;i<modes.size();i++){
            result[i] = modes.get(i);
        }
        return result;
    }
    
    public void traverse(TreeNode node, List<Integer> modes){
        if(node==null) return;
        
        traverse(node.left, modes);
        if(prev!=null){
            if(prev==node.val){
                count++;
            }else{
                count=1;
            }
        }
        if(count>max){
            max=count;
            modes.clear();
            modes.add(node.val);
        }else if(count==max){
            modes.add(node.val);
        }
        prev=node.val;
        traverse(node.right,modes);
    }
}


class Solution {
  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int steps = 1;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      // Level iteration
      while (size-- > 0) {
        TreeNode removed = queue.remove();
        // Leaf reached
        if (removed.left == null && removed.right == null) {
          return steps;
        }
        if (removed.left != null) {
          queue.add(removed.left);
        }
        if (removed.right != null) {
          queue.add(removed.right);
        }
      }
      steps++;
    }
    return steps;
  }
}

class Solution {
  public List<Integer> minSubsequence(int[] nums) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });
    int totalSum = 0;
    for (int num : nums) {
      pq.add(num);
      totalSum += num;
    }
    List<Integer> list = new ArrayList<>();
    int currSum = 0;
    while (currSum <= totalSum) {
      int num = pq.poll();
      currSum += num;
      totalSum -= num;
      list.add(num);
    }
    return list;
  }
}

class Solution {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
    for (int stone : stones) {
      pq.add(stone);
    }
    while (pq.size() > 1) {
      int max1 = pq.poll();
      int max2 = pq.poll();
      if (max1 != max2) {
        pq.add(max1 - max2);
      }
    }
    return pq.isEmpty() ? 0 : pq.peek();
  }
}


class Solution {
  public int[] frequencySort(int[] nums) {
    Map<Integer, Long> counter = Arrays.stream(nums).boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())
    );
    PriorityQueue<Integer> frequencyMinHeap = new PriorityQueue<>((o1, o2) -> {
      int c = (int) (counter.get(o1) - counter.get(o2));
      return c != 0 ? c : o2 - o1;
    });
    frequencyMinHeap.addAll(counter.keySet());
    int[] sortedByFrequency = new int[nums.length];
    for (int idx = 0; idx < sortedByFrequency.length;) {
      int value = frequencyMinHeap.poll();
      long count = counter.get(value);
      while (count-- > 0) {
        sortedByFrequency[idx++] = value;
      }
    }
    return sortedByFrequency;
  }
}

class Solution {
  public int[] sortByBits(int[] arr) {
    return Arrays.stream(arr).boxed()
        .sorted(Comparator.comparingInt(Integer::bitCount).thenComparingInt(o -> o))
        .collect(Collectors.toList())
        .stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}

class KthLargest {
  PriorityQueue<Integer> pq;
  int k;
  public KthLargest(int k, int[] nums) {
    pq = new PriorityQueue<>();
    this.k = k;
    for (int num : nums) {
      add(num);
    }
  }

  public int add(int num) {
    if (pq.size() < k) {
      pq.add(num);
    }
    else if (pq.peek() < num) {
      pq.poll();
      pq.add(num);
    }
    return pq.peek();
  }
}

class Solution {
  public int findComplement(int num) {
    StringBuilder sb = new StringBuilder();
    while (num > 0) {
      int rem = num % 2;
      num /= 2;
      sb.append(rem);
    }
    StringBuilder complement = new StringBuilder();
    for (int i = 0; i < sb.length(); i++) {
      complement.append(sb.charAt(i) == '1' ? '0' : '1');
    }
    int newNum = 0;
    int pow = 0;
    for (int i = 0; i < complement.length(); i++) {
      newNum += ((int) Math.pow(2, pow)) * Character.getNumericValue(complement.charAt(i));
      pow++;
    }
    return newNum;
  }
}
