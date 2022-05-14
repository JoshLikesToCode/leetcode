class Solution {
  static final int[][] DIRECTIONS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

  public void wallsAndGates(int[][] rooms) {
    final Queue<int[]> gates = new LinkedList<>();
    for (int i=0; i < rooms.length; i++) {
      for (int j=0; j < rooms[i].length; j++) {
        if (rooms[i][j] == 0) gates.add(coords(i, j));
      }
    }

    walkFromGates(rooms, gates);
  }

  void walkFromGates(int[][] rooms, Queue<int[]> q) {
    while (!q.isEmpty()) {
      int[] cur = q.poll();
      int i = cur[0], j = cur[1];
      int distance = rooms[i][j] + 1;
      for(int[] dir : DIRECTIONS){
        int[] next = coords(i + dir[0], j + dir[1]);
        if (empty(rooms, next)) { q.add(next); setDistance(rooms, next, distance); }
      }
    }
  }

  int[] coords(int i, int j) {
    return new int[]{i, j};
  }

  boolean empty(int[][] rooms, int[] coords) {
    final int i = coords[0], j = coords[1];
    return i >= 0 && i < rooms.length
        && j >= 0 && j < rooms[i].length
        && rooms[i][j] == 2147483647;
  }

  void setDistance(int[][] rooms, int[] coords, int steps) {
    final int i = coords[0], j = coords[1];
    rooms[i][j] = steps;
  }
}
