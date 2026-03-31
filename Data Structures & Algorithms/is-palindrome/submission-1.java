class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0;i<s.length();i++){
        //     if(Character.isLetter(s.charAt(i))){
        //         sb.append(s.charAt(i));
        //     }
        // }
        // String combined = sb.toString();
        String combined = s.replaceAll("[^a-zA-Z0-9]","");
        String res = combined.toLowerCase();
        System.out.print(res);
        int i = 0;
        int j = res.length() - 1;
        while(i < j){
            if(res.charAt(i) != res.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
