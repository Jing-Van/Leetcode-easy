class Solution {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i=0; i<nums.length; i++) {
            if (queue.size() < k) {
                queue.add(nums[i]);
            }
            else {
                if (nums[i] > queue.peek()) {
                    System.out.println("removed");
                    System.out.println(queue.remove());
                    System.out.println("removed done");
                    queue.add(nums[i]);
                }
            }
            /* removed 2 first, because 2 is smaller;
            then when 5 added, 5->3
            so next time 3 wil be removed;
            removed
            2
            removed done
            removed
            3
            removed done
            */
            // 3 2 2 3 5 5 
            //System.out.print(queue.peek()+" ");
        }

        return queue.remove();
    }
}