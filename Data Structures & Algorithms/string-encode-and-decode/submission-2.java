class Solution {
    char part = (char)257;
    public String encode(List<String> strs) {
        if(strs.size() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str);
            sb.append(part);
        }
        // sb.deleteCharAt(sb.length() -1);
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.equals("")) return new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == part){
                list.add(sb.toString());
                sb.setLength(0);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return list;
    }
}
