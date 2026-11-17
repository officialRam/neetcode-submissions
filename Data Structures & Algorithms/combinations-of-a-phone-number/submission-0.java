class Solution {

    List<String> combinations(HashMap<Integer, String> mp, String digits, int index){
        if(index==0){
            List<String> ans=new ArrayList();
            String chars=mp.get(Character.getNumericValue(digits.charAt(index)));
            for(int i=0; i<chars.length();i++){
                ans.add(String.valueOf(chars.charAt(i)));
            }
            return ans;
        }
        List<String> temp=combinations(mp, digits, index-1);
        List<String> ans=new ArrayList<>();
        String chars=mp.get(Character.getNumericValue(digits.charAt(index)));
        for(int i=0; i<chars.length();i++){
                for(int j=0; j<temp.size();j++){
                ans.add(temp.get(j)+chars.charAt(i));
            }
            }
        return ans;
    }
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        HashMap<Integer, String> mp=new HashMap<>();
        mp.put(2, "abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5, "jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");

        return combinations(mp, digits, digits.length()-1);

        
        
    }
}
