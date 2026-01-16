class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> set = new HashSet<>();
        set.add("+");set.add("-");set.add("*");set.add("/");
        Stack<String> calc = new Stack<>();
        for(int i=0;i< tokens.length;i++){
            String cur = tokens[i];
            if(!set.contains(cur)){
                calc.push(cur);
            }
            else{
                int sec = Integer.parseInt(calc.pop());
                int first = Integer.parseInt(calc.pop());
                int res = operate(cur,first,sec);
                calc.push(Integer.toString(res));
            }
        }
        return Integer.parseInt(calc.peek());
    }
    public int operate(String symbol,int first,int second){
        return switch (symbol) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            default -> first / second;
        };

    }
}
