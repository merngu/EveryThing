package com.example.tu;

import java.util.ArrayList;

public class Graph {
    // 存储顶点集合
    private ArrayList<String> vertexList;
    // 存储图对应的邻结矩阵
    private int[][] edges;
    // 表示边的数目
    private int numOfEdges;
    // 记录这个节点是否被访问
    private boolean[] isVisited;

    public static void main(String[] args) {


    }

    public Graph(int n) {
        //初始化矩阵和vertexList
        edges = new int[n][n];
        vertexList = new ArrayList<String>();
        numOfEdges = 0;
    }

    // 得到第一个邻接节点的下标w
    /**
     * 如果存在就返回对应的下标,否则返回-1
     */
    public int getFirstNeighbor(int index){
        for (int i = 0; i < vertexList.size(); i++) {
            if (edges[index][i]>0){
                return i;
            }
        }
        return -1;
    }

    // 根据前一个邻接结点的下标获取下一个邻接节点
    public int getNextNeighbor(int v1,int v2){
        for (int i = v2 + 1; i < vertexList.size(); i++) {
            if (edges[v1][i]>0){
                return i;
            }
        }
        return -1;
    }

    // 深度优先便利算法
    private void dfs(boolean[] isVisited,int i){
        // 首先我们访问该节点,输出
        System.out.println(getValueByIndex(i) + "->");
        // 将节点设置为已经访问
        isVisited[i] = true;
        // 寻找节点i的第一个邻接节点w
        int w = getFirstNeighbor(i);
        while (w!=-1){
            // 说明有
            if (!isVisited[w]){
                dfs(isVisited,w);
            }
        }
    }

    private String getValueByIndex(int i) {
        return vertexList.get(i);
    }

}
