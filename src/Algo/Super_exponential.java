package Algo;//Super-exponential Time (O(n^n)):
//
//        Example: Solving the traveling salesman problem.

public class Super_exponential {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };
        int[] visited = new int[graph.length];
        visited[0] = 1;
        int minCost = tsp(graph, visited, 0, 1);
        System.out.println(minCost); // prints 80

    }

    static int tsp(int[][] graph, int[] visited, int currPos, int count) {
        if (count == graph.length) {
            return graph[currPos][0];
        }
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < graph.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                int cost = graph[currPos][i] + tsp(graph, visited, i, count + 1);
                if (cost < minCost) {
                    minCost = cost;
                }
                visited[i] = 0;
            }
        }
        return minCost;
    }
}
