

//User function Template for Java
/*Complete the function below*/
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> stack = new Stack<>();
        // Last in first out --> reverse the queue elements 
        while (!q.isEmpty()){
            stack.add(q.peek());
            q.remove();
        }
        while(!stack.isEmpty()){
            q.add(stack.peek());
            stack.pop();
        }
        return q;
    }
}