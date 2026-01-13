
class Solution {

    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        List<Character> left = new ArrayList<>();
        List<Character> right = new ArrayList<>();
        left.add('(');left.add('{');left.add('[');
        right.add(')');right.add('}');right.add(']');

        Stack<Character> check = new Stack<>();
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(left.contains(cur)){
                check.push(cur);
            }
            if(right.contains(cur)){
                if(check.isEmpty()){
                    return false;
                }
                if(left.indexOf(check.pop())!=right.indexOf(cur)){
                    return false;
                }
            }
        }
        return check.isEmpty();
       
    }


}
 
