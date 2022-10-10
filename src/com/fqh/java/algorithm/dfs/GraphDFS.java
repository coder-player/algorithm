package com.fqh.java.algorithm.dfs;

/**
 * @author 我劝你荔枝_FQH
 * @version 1.0
 * Date: 2022/5/24 14:41:18
 */
public class GraphDFS {


    public static void main(String[] args) {

        char[][] graph = {
                {1, 4},
                {3},
                {1},
                {2},
                {},
        };
        boolean[] isVisited = new boolean[node.length];

        dfs(graph, isVisited, 0);
    }

    static char[] node = {'A', 'B', 'C', 'D', 'E'};
    //DFS
    public static void dfs(char[][] graph, boolean[] isVisited, int start) {
        if (isVisited[start]) {
            return;
        }
        isVisited[start] = true;
        System.out.println(node[start]);
        for (int v : graph[start]) {
            dfs(graph, isVisited, v);
        }
    }
    //构建邻接表

}
