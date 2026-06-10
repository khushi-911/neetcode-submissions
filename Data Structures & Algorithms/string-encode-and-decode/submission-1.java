class Solution {

    public String encode(List<String> strs) {
        String text = "";
        for(int i = 0; i < strs.size(); i++){
            text += strs.get(i);
            text += ".";
        }
        return text;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        String ele = "";
        for(int i = 0; i < str.length(); i++){
             if(str.charAt(i) != '.'){
             ele += str.charAt(i);
             }
             if(str.charAt(i) == '.'){
                result.add(ele);
                ele = "";
             }
        }
        return result;
    }
}
