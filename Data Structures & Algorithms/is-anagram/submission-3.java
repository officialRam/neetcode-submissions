class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] temp= new int['z'-'a'+1];
        for(Integer i=0; i<s.length(); i++){
            temp[s.charAt(i)-'a']++;
        }
        for(Integer i=0; i<t.length(); i++){
            temp[t.charAt(i)-'a']--;
        }
        for(Integer i=0; i<('z'-'a'+1); i++){
            if(temp[i]!=0){
                return false;
            }
        }
        return true;


    }
}
