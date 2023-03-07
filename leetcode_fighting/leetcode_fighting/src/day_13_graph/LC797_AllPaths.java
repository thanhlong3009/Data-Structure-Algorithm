package day_13_graph;

import java.util.ArrayList;
import java.util.List;

public class LC797_AllPaths {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(graph,0,ans,new ArrayList<>());
        return ans;
    }
    private void dfs(int[][] graph,int v,List<List<Integer>> ans,List<Integer> path) {
        path.add(v);
        if(v==graph.length-1) {
            ans.add(new ArrayList<>(path));
        } else {
            for(int i=0;i<graph[v].length;i++) {
                dfs(graph,graph[v][i],ans,path);
            }
        }
        path.remove(path.size()-1);
    }
}
