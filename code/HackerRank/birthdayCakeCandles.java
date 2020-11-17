    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        int tallest=Integer.MIN_VALUE;
        int count=0;
        int len=candles.size();
        for(int i=0;i<len;i++){
            int num=candles.get(i);
            if(num > tallest){
                tallest=candles.get(i);
                count=0;
            }if(num == tallest){
                count++;
            }
        }
        return count;

    }
