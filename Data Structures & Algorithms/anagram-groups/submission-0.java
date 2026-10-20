class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] temp = new int['z' - 'a' + 1];

            for (int j = 0; j < strs[i].length(); j++) {
                temp[strs[i].charAt(j) - 'a']++;
            }

            String key = Arrays.toString(temp);

            if (map.get(key) == null) {
                map.put(key, new ArrayList<>(List.of(i)));
            } else {
                List<Integer> current = map.get(key);
                current.add(i);
                map.put(key, current);
            }
        }

        for (var each : map.entrySet()) {
            List<Integer> temp = each.getValue();
            List<String> temp2 = new ArrayList<>();

            for (int i = 0; i < temp.size(); i++) {
                temp2.add(strs[temp.get(i)]);
            }

            ans.add(temp2);
        }

        return ans;
    }
}