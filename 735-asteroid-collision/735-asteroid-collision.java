class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> astStack = new Stack<>();
        for(int a : asteroids)
        {
            boolean blownUp = false;
            int currAst = a;
            while(!astStack.isEmpty() && astStack.peek() > 0 && currAst < 0) // only asteroids moving in opposite directions will result in a collision
            {
                int topAst = astStack.pop();
                if(topAst == -currAst)  // only asteroids moving in different directions and the same size result in a blow up
                {
                    blownUp = true;
                    break;
                }
                else // if the asteroids collide and are not the same size, the asteroid with the largest size remains
                {
                    if(topAst > -currAst)
                       currAst = topAst;
                }
            }
            if(!blownUp) // first asteroid goes here, and currAsteroids that passes without an explosion
                astStack.push(currAst);
        }
        int[] res = new int[astStack.size()];
        int resIdx = 0;
        for(Integer a : astStack)
            res[resIdx++] = a;
        return res;
    }
}