class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(char c: s.toCharArray()){
            if(c=='(') stack.push(')');

            else if(c=='{') stack.push('}');

            else if(c=='[') stack.push(']');

            else if(stack.isEmpty() || stack.pop() !=c) return false;
        }

        return stack.isEmpty();
    }
}

//here first adding the right brace to a stack using left brace
//as per the iteration if right brace already exists in string then element pops out from stack
//at one point of time the stack becomes empty means all elements are in right order so :TRUE returns
//if there are elements in stack means, paranthesis are not in right way so: FALSE

//tc = O(n), sc = O(n)
