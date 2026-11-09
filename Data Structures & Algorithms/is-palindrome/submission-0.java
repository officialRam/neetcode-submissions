class Solution {
    public boolean isPalindrome(String s) {
        int st=0, end=s.length()-1;
        char stC='A', endC='Z', stc='a', endc='z', stD='0', endD='9';
        String temp="";
        while (st <= end) {
    char ch = s.charAt(st);

    if ((ch >= stC && ch <= endC) ||
        (ch >= stc && ch <= endc) ||
        (ch >= stD && ch <= endD)) {

        temp += Character.toLowerCase(ch);
    }

    st++;
}
        st=0;
        end=temp.length()-1;
        while(st<=end){
            if(temp.charAt(st)!=temp.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;

    }
}
