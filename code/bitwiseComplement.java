class Solution {
    public int bitwiseComplement(int N) {
        String binValues = Integer.toBinaryString(N);
        StringBuilder sb=new StringBuilder();
        for (char c:binValues.toCharArray()){
            System.out.println(Character.getNumericValue(c)^1);
            sb.append(Character.getNumericValue(c)^1);
        }
        return Integer.parseInt(sb.toString(),2);
        
    }
}