class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map=new HashMap();
        for(Integer i=0; i<s.length(); i++){
            var temp=map.get(s.charAt(i));
            if(temp==null){
            map.put(s.charAt(i), 1);

            }
            else{
                map.put(s.charAt(i), temp+1);

            }
            
        }
        HashMap<Character, Integer> map2=new HashMap();
        for(Integer i=0; i<t.length(); i++){
            var temp=map2.get(t.charAt(i));
            if(temp==null){
            map2.put(t.charAt(i), 1);

            }
            else{
                map2.put(t.charAt(i), temp+1);

            }
            
        }
        for(var each:map2.entrySet()){
            if (!each.getValue().equals(map.get(each.getKey()))) {
    return false;
}
        }
        return true;

    }
}
