class Solution {
    public int strStr(String haystack, String needle) {

        int i = 0;

        while(i <= (haystack.length() - needle.length())){
            int count = 0;
            // int j = 0;
            int k = i;
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int l = 0 ; l < needle.length(); l++){
                    if(haystack.charAt(k) == needle.charAt(l)){
                        count++;
                        k++;
                    }
                }
                if(count == needle.length()){
                    return i;
                }
            }
            i++;
        }
        return -1;
        
    }
}