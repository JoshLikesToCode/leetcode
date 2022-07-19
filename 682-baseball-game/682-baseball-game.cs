public class Solution {
    public int CalPoints(string[] ops) {
        Stack<int> stack = new Stack<int>();
        foreach(string op in ops)
        {
            if (int.TryParse(op, out int val)) 
                stack.Push(val);
            else if(op == "C")
                stack.Pop();
            else if(op == "D")
                stack.Push(2 * stack.Peek());
            else
            {
                int v1 = stack.Pop();
                int v2 = stack.Pop();
                stack.Push(v2);
                stack.Push(v1);
                stack.Push(v1 + v2);
            }
        }

        return stack.Sum();
    }
}

