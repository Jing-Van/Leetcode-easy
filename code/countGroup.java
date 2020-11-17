import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'countGroups' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY related as parameter.
     */

    public static int countGroups(List<String> related) {
        if(related==null||related.size()==0){
            return 0;
        }
        int m=related.size();
        int n=related.get(0).length();
        int[][] arr=new int[m][n];
        int curr=0;
        for(String s:related){
            int[] array=new int[s.length()];
            for(int i=0;i<s.length();i++){
                array[i]=Integer.parseInt(s.charAt(i)+"");
            }
            arr[curr]=array;
            curr++;
            
        }
        // int m=arr.length;
        // int n=arr[0].length;
        
        System.out.println(m + ":" + n);
        
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1&&i!=j){
                    count++;
                }
            }
        }
        
        
        return count;
    }

}

public class Solution {

/*

4
1100
1110
0110
0001

*/
Expected Output

Download
2

if(map.get(i)<1){
    connected.add(i);
}else{
    map.put(i,map.getOrDefault(i, 0)+1);
}
if(map.get(j)<1){
    connected.add(j);
}else{
    map.put(j,map.getOrDefault(j, 0)+1);
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'countGroups' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY related as parameter.
     */

    public static int countGroups(List<String> related) {
        if(related==null||related.size()==0){
            return 0;
        }
        int m=related.size();
        int n=related.get(0).length();
        int[][] arr=new int[m][n];
        int curr=0;
        for(String s:related){
            int[] array=new int[s.length()];
            for(int i=0;i<s.length();i++){
                array[i]=Integer.parseInt(s.charAt(i)+"");
            }
            arr[curr]=array;
            curr++;
            
        }
        // int m=arr.length;
        // int n=arr[0].length;
        
        System.out.println(m + ":" + n);
        
        Set<Set<Integer>> groups=new HashSet<>();
        List<Integer> connected=new ArrayList<>();
        for(int i=0;i<m;i++){
            //Map<Integer,Integer> map=new HashMap<>();
            List<Integer> appeared=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(arr[i][j]==1&&i!=j){
                    if(!appeared.contains(i)){
                        connected.add(i); 
                        appeared.add(i);
                    }

                    if(!appeared.contains(j)){
                        connected.add(j); 
                        appeared.add(j);   
                    }                    
                }

            }
            groups.add(new HashSet(connected));
        }
        
        System.out.println(groups);
        int longest=-1;
        Set<Integer> longestGroup=new HashSet<>();
        for(Set<Integer> s:groups){
            longest=Math.max(longest,s.size());
            longestGroup=s;
            
            
        }
        
        System.out.println(longestGroup);
        Set<Set<Integer>> result = new HashSet<>();
        result.add(longestGroup);
        // todo1: create prev group, merge groups
        for(Set<Integer> s:groups){
            for(int num:s){
                if(!longestGroup.contains(num)){
                    result.add(s);
                }
            }
 
        }    
        
        // to do2 : loop through people, if not occur in any of the groups, groups++

        // if(longest<m&result.size()<2){
        //     return 2;
        // }else{
        //     return result.size();
        // }
        
        
        //return 2;
    }

}

public class Solution {