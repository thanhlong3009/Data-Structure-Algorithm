package day_13_graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        int [][] graph = {
                //   0  1  2  3  4  5  6
                    {0, 1, 0, 0, 0, 0, 0}, //0
                    {1, 0, 1, 1, 1, 0, 0}, //1
                    {0, 1, 0, 0, 0, 1, 0}, //2
                    {0, 1, 0, 0, 0, 1, 1}, //3
                    {0, 1, 0, 0, 0, 0, 1}, //4
                    {0, 0, 1, 1, 0, 0, 0}, //5
                    {0, 0, 0, 1, 1, 0, 0}  //6
        };
        DFS_stack(graph);
        System.out.println();
        Set<Integer> visited = new HashSet<>();
        DFS_rec(graph,visited,0);
    }
    private static void DFS_stack(int[][] graph){
        Stack<Integer> stack = new Stack<>();
        // add dinh dau tien
        stack.add(0);
        // danh dau 0 da duoc duyet
//        Set<Integer> visited = new  HashSet();
//        visited.add(0);
        boolean[] visited = new boolean[100];
        visited[0] = true;
        // duyet cho den khi stack rong
        while (!stack.empty()){
            // lay ra dinh o top
            int u = stack.pop();
            // process dinh u
            System.out.print(u +  "-");
            // add cac dinh ke voi u vao stack
            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] == 1 && !visited[v]) {
                    stack.push(v);
                    // danh dau v da duoc visited
                    visited[v] = true;
                }
            }
        }
    }

    private static void DFS_rec(int[][] graph, Set<Integer> visited, int u){
        // process
        System.out.print(u + "-");
        visited.add(u);
        for (int v = graph.length-1 ; v >= 0; v--) {
            if (graph[u][v] == 1 && !visited.contains(v) ){
//                visited.add(v);
                DFS_rec(graph,visited,v);
            }
        }
    }
}
