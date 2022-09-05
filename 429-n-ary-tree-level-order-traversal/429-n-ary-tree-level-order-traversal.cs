/*
// Definition for a Node.
public class Node {
    public int val;
    public IList<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, IList<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

public class Solution {
    public IList<IList<int>> LevelOrder(Node root) {
        List<IList<int>> res = new List<IList<int>>();
        if(root == null)
            return res;
        Queue<Node> q = new Queue<Node>();
        q.Enqueue(root);
        while(q.Count() != 0)
        {
            int size = q.Count();
            IList<int> currLvlList = new List<int>();
            for(int i = 0; i < size; i++)
            {
                Node node = q.Dequeue();
                currLvlList.Add(node.val);
                foreach(Node child in node.children)
                {
                    q.Enqueue(child);
                }
            }
            res.Add(currLvlList);
        }
        return res;
    }
}