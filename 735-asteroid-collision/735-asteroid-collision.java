class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> astStack = new Stack<>();
        for(int a : asteroids)
        {
            boolean blownUp = false;
            int currAst = a;
            while(!astStack.isEmpty()  && astStack.peek() > 0 && currAst < 0)
            {
                int topAst = astStack.pop();
                if(topAst == -currAst)
                {
                    blownUp = true;
                    break;
                }
                else
                {
                    if(topAst > -currAst)
                        currAst = topAst;
                }
            }
            if(!blownUp)
                astStack.add(currAst);
        }
        
        int[] res = new int[astStack.size()];
        int resIdx = 0;
        for(int addAst : astStack)
            res[resIdx++] = addAst;
        return res;
    }
}