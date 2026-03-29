class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null) return null;
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char innerStr[] = strs[i].toCharArray();
            Arrays.sort(innerStr);
            String s = new String(innerStr);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
         
    }
}
