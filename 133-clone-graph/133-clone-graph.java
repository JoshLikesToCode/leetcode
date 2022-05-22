/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> visitedMap = new HashMap<>();
    
    public Node cloneGraph(Node node) {
        if(node == null)
            return node;
        // if the node was previously visited,
        // then return the clone from the visited map
        if(visitedMap.containsKey(node))
            return visitedMap.get(node);
        Node clonedNode = new Node(node.val, new ArrayList<>());
        visitedMap.put(node, clonedNode);
        for(Node neighbors : node.neighbors)
            clonedNode.neighbors.add(cloneGraph(neighbors));
        return clonedNode;
        
    }
}