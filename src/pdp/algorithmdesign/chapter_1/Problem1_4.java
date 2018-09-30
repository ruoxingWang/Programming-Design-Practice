package pdp.algorithmdesign.chapter_1;

import pdp.algorithmdesign.Problem;

/**
 * 日期:2018-03-20 19:33 星期二
 * 作者:ruoxing Wang
 * 描述:1-4 金币阵列问题
 * ◆问题描述:有m*n(m<=100,n<=100)枚金币在桌面上排成一个m行n列的金币阵列.
 *           每一枚金币的正面或朝上或朝下,数字0表示正面朝上,1表述正面朝下.
 *◆游戏规则:(1)每次可将任【一行】金币翻过来放在原来的位置上。
 *          (2)每次可任选【两行】,交换这2列金币的位置.
 * ◆算法设计:给定金币阵列的初始状态和目标状态,按游戏规则.计算最少交换多少次能转换到目标状态
 * ◆数据输入:input.txt
 *           2        ---样例数目
 *           4 3      ---m行 n列
 *           1 0 1
 *           0 0 0
 *           1 1 0
 *           1 0 1
 *           1 0 1
 *           1 1 1
 *           0 1 1
 *           1 0 1
 *           4 3
 *           1 0 1
 *           0 0 0
 *           1 0 0
 *           1 1 1
 *           1 1 0
 *           1 1 1
 *           0 1 1
 *           1 0 1
 * ◆输出结果:output.text
 *           2
 *           -1    ---表示无解
 */
public class Problem1_4 extends Problem{

    /**
     * 描述:主要算法
     */
    public static void main(String[] args) {
        Problem1_4 problem1_4 = new Problem1_4();
        int k = problem1_4.scanner.nextInt();//有k个样例
        while(k -- > 0) {
            int m = problem1_4.scanner.nextInt();
            int n = problem1_4.scanner.nextInt();
            int[][] sourceMatrix = new int[m][n];
            int[][] targetMatrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sourceMatrix[i][j] = problem1_4.scanner.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    targetMatrix[i][j] = problem1_4.scanner.nextInt();
                }
            }
            final int[][] subtract = subtract(sourceMatrix, targetMatrix);
            rowNot(subtract);
            printMatrix(subtract);
            System.out.println("次数=" + minTimes);
            System.out.println("=================================================");
        }
        problem1_4.scanner.close();
    }

    /**
     * 描述:两个二维矩阵相加
     */
    public static int[][] subtract(int[][] sourceMatrix,int[][] targetMatrix) {
        int m = sourceMatrix.length;
        int n = sourceMatrix[0].length;
        int[][] resultMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultMatrix[i][j] = sourceMatrix[i][j] - targetMatrix[i][j];
            }
        }
        return resultMatrix;
    }


    private static int minTimes = 0;
    /**
     * 描述:取反二维矩阵的相同行
     */
    public static void rowNot(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int times = 0;
            int temp = matrix[i][0];
            for (int j = 0; j < n; j++) {
                if (temp == 0 || temp != matrix[i][j]) break;
                times ++;
            }
            if (times == n) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
                minTimes ++;
                System.out.println("取反第" + (i+1) + "行");
            }
        }
    }

    /**
     * 描述:打印二维矩阵
     */
    public static void printMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}