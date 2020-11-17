

// you can also use imports, for example:
import java.util.*;

public class PriorityQueue{
    
    // n means nth biggest 
    public static int secondMF(int[] arr, Integer n){
        int len=arr.length;
        Map<Integer, Integer> map=new HashMap<>();
        
        for (int i=0;i<len;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer o1,Integer o2){
                // int c=map.get(o1)-map.get(o2);
                // if(c!=0){
                //     return c;
                // }
                return o1-o2;
            }
            
        });
        
        // map value example; (2,3) (1,2) (3, 1) ...
        
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.print(entry.getKey() + " : " +  entry.getValue());
            // System.out.print(entry.getValue());
            //System.out.println("**************");
            
            pq.add(entry.getValue());

        }
        
        //
        System.out.println(pq);
        // pseudo code here, come back after
        int ans=-1;
        for(int j=0;j<n;j++){
            ans=pq.poll();
        }
        
        //return 1;
        System.out.println(ans);
        
        
        //return ans;

        int finalans=-1;        
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.print(entry.getKey() + " : " +  entry.getValue());
            // System.out.print(entry.getValue());
            //System.out.println("**************");
            
            if(ans==entry.getValue()){
                System.out.println(finalans);
                finalans=entry.getValue();
                return finalans;
            }

        }
        return -1;
        
        
    }

    public static void main(String [] args) {
        // you can write to stdout for debugging purposes, e.g.
        // returns the biggest of the number of the frequency is the same
        System.out.println("This is a debug message");
        //[2,2,1,3,5,2,4,5,6,9,7,5,1]
        int[] arr={2,2,1,3,5,2,4,5,6,9,7,5,1};
        
        /*
            1 - 2
            2 - 3
            3 - 1
            4 - 1
            5 - 3
            6 - 1
            7 - 1
            9 - 1
            
            ans = 1
            
        */
        
        System.out.println(secondMF(arr,2));
    }
}
