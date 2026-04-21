class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i = 0;i<tokens.length;i++){
            if(tokens[i].equals("+")  || tokens[i].equals("-") || tokens[i].equals("*")|| tokens[i].equals( "/")){
                if(tokens[i].equals("+")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a+b);
                    }
                if(tokens[i].equals("-")){
                    int a  =  stack.pop();
                    int b  =  stack.pop();
                 
                    stack.push(b-a);

                }
                if(tokens[i].equals("*")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a*b);
                }
                if(tokens[i].equals("/")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b/a);
                }


            }

            else{
                int c = Integer.parseInt(tokens[i]);
                stack.push(c);
            }
        }
       
        return  stack.pop();
    }
}
