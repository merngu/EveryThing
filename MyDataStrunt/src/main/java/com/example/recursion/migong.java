package com.example.recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * FileName: migong
 * Author: bai
 * Date:   20242024/2/6下午3:57
 * Description:dfs
 * <author> maziyu
 */
public class migong {
    public static void main(String[] args) {

        // 地图
        int[][] map = new int[8][7];

        // 上下设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        // 左右设置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        // 数据二维数组
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }








    }

    /**
     * MethodName: ${NAME}
     * Author: maziyu
     * Date:   ${YEAR}${DATE}${TIME}
     * Description: 1. map代表地图
     *              2. i,j 表示地图的哪个位置出发
     *              3. 如果小球能到map[6][5] 位置,则说明通路找到
     *              4. 约定:  当map[i][j] 为 0 表示该点没有走过 当为 1 表示墙; 2 表示通路可以走,3表示该点已经走过,但是走不通
     *              5. 在走迷宫时,需要确定御哥策略(方法) 下->右->上->左,如果该点走不通,再回溯
     */

    public static boolean setWay(int[][] map,int i,int j){
        if (map[6][5] == 2){
            // 表示通路已经找到
            return true;
        } else  {
            // 按照 下->右->上->左 的方法走
            if(setWay(map,i+1,j)){ // 向下走
                return true;
            } else if (setWay(map,i -1,j)){
                return true;
            } else if (setWay(map, i, j - 1)) {
                return true;
            } else {
                map[i][j] = 3;
                return false;
            }
        }


    }
}



