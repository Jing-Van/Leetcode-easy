class Solution {
    public String gcdOfStrings(String str1, String str2) {
        return stringGcd(str1, str2);
    }
    
    private String stringGcd(String s1, String s2) {
        if (s1.length() == 0) {
            return s2;
        }
        
        if (s2.length() == 0) {
            return s1;
        }
        
        if (s1.equals(s2)) {
            return s1;
        }
        
        if (s1.length() > s2.length()) {
            for (int i = 0; i < s2.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return "";
                }
            }
            
            String temp = s1.substring(s2.length());
            return stringGcd(temp, s2);
        }
        
        if (s2.length() > s1.length()) {
            return stringGcd(s2, s1);
        }
        
        return "";
        
        // case that str1 lengh shorter, missing 
        // assumed s2 is shorter
        
//         int l2=str2.length();
//         String largest="";
//         for(int i=0;i<l2;i++){
//             String subString=str2.substring(0,i+1);
//             for(int j=0;j<1000;j++){
//                 if (str1.equals(String.join("", Collections.nCopies(j, subString)))){
//                     largest=(subString.length()>largest.length())?subString:largest;
//                 }
//             }
//         }
                    
//         return largest;
    }
}