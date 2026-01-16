class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result =new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            int cur = temperatures[i];
            while(!stack.isEmpty()&&temperatures[stack.peek()]<cur){
                int top = stack.pop();
                result[top]=i-top;
            }
            stack.push(i);
        }

        return result;
    }
}
