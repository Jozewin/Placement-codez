class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for(String l : strs){
            str.append("|").append(l);
        }

        return str.toString();
    }
    
    public List<String> decode(String str) {
        char[] strArr = str.toCharArray();
        List<String> ans = new ArrayList<>();
        int i = 1;
        int start = 1;
        for( i = 1 ; i < str.length(); i++ ){

            if (str.charAt(i) == '|'){
               String temp = str.substring(start, i);
               ans.add(temp);
               start = i + 1;
            }
        }
        if(str.length() != 0){
            String temp = str.substring(start, i);
            ans.add(temp);
        }

        return ans;
    }

}
