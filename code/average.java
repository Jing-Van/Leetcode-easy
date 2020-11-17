class Solution {
    public double average(int[] salary) {
        
        List<Integer> list = Arrays.stream(salary).boxed().collect(Collectors.toList());
        //List<Integer> list = Arrays.asList(salary);
        int min= Collections.min(list);
        int max= Collections.max(list);
        System.out.println(list);
        int sum=0;
        for(int s:salary){
            if(s>min&&s<max){
                sum+=s;
            }
        }
        return (double)(double)(sum)/(double)(salary.length-2);
    }
}